package LuokkaJAolio2;

import java.util.Scanner;

public class AddressBookApp {
    public void tulostaOhje(){
        System.out.print("This is an address book application. Available commands:\r\n" + //
                        " list\r\n" + //
                        " help\r\n" + //
                        " add <name>, <email>, <phone>\r\n" + //
                        " search <name>\r\n" + //
                        " exit");
    }

    public void luoYhteystieto(String theRest,AddressBook ab){
        String[] parts = theRest.split(",");

        String name = parts[0].trim();
        String email = parts[1].trim();
        String phone = parts[2].trim();

        Contact contact = new Contact(name, email, phone);
        if (ab.add(contact)) {
            System.out.println("Added " + contact.toString());
        } else {
            System.out.println("That contact already exists.");
        }
    }
        
    public static void main(String[] args) {
        AddressBookApp aba = new AddressBookApp();
        AddressBook ab = new AddressBook();
        Scanner input = new Scanner(System.in);
        boolean running = true;

        aba.tulostaOhje();

        while (running) {
            System.out.print("> ");
            String command = input.next();
            String theRest = input.nextLine().trim();

            // ... toimintalogiikka
            
            switch (command) {
            case "help":
                // tulosta ohje
                aba.tulostaOhje();
                break;
            case "list":
                // tulosta osoitekirjan koko sisältö
                System.out.print(ab.toString());
                break;
            case "add":
                // käytä annettua nimeä, emailia ja puhelinnumeroa luodaksesi uuden yhteystiedon
                aba.luoYhteystieto(theRest, ab);
                break;
            case "search":
                // etsi yhteystietoa ja tulosta se
                Contact yhteystieto = ab.search(theRest);
                if(yhteystieto == null){
                    System.out.println(theRest.trim() + " does not match any contact.");
                }else{
                    System.out.println(yhteystieto.toString());
                }

                break;
            case "exit":
                // poistu ohjelmasta
                System.out.println("Bye!");
                running = false;
                input.close();
                break;
            default:
                // tunnistamaton komento:
                System.out.println("Unknown command");
                break;
            }
            
        }
    }
}
