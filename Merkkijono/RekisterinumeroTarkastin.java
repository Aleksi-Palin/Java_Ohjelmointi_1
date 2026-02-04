package Merkkijono;
import java.util.Scanner;

public class RekisterinumeroTarkastin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String rekisterinumero;
        
        
        while(true){
            System.out.print("Syötä rekisterinumero (q-kirjain lopettaa): ");
            rekisterinumero = s.nextLine();
            if(!rekisterinumero.equals("q")){
                if(rekisterinumero.matches("[a-zA-ZäöåÄÖÅ]{2,3}-[0-9]{1,3}")){
                System.out.println(rekisterinumero + " on kelvollinen rekisterinumero.");
                }else{
                    System.out.println(rekisterinumero + " ei ole kelvollinen rekisterinumero.");
                }
            }else{
                break;
            }
            
        }

        s.close();
    }
}
