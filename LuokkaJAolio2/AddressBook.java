package LuokkaJAolio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AddressBook {

    private List<Contact> contacts;

    public AddressBook() {
        this.contacts = new ArrayList<>();
    }

    public boolean add(Contact newContact) {
        
        for(Contact current : this.contacts){
            String contactDetails = current.toString();

            if(newContact.toString().equals(contactDetails)){
                // Samankaltainen yhteystieto löydetti, ei lisätä
                return false;
            }
        }
        // Ei samankaltaista yhteystietoa löydetty, lisätään
        this.contacts.add(newContact);
        return true;
    }

    public Contact search(String keyword) {
        for (Contact current : this.contacts) {
            String name = current.getName();
            if (name != null && name.toLowerCase().contains(keyword.toLowerCase())) {
                return current; // palautetaan löytynyt arvo heti
            }
        }
        return null; // palautetaan null, jos ei löytynyt
    }

    @Override
    public String toString() {

        Collections.sort(contacts,Comparator.comparing(Contact::getName));

        String Luettelo = "";
        for (Contact contact : this.contacts) {
            
            Luettelo += contact.toString() + "\n";
        }
        return Luettelo;
    }
}