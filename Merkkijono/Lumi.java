package Merkkijono;
import java.util.Scanner;

public class Lumi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String nimi ="";
        int nimiC = 0;
        int lumiC = 0;
        do{
            System.out.print("Anna nimi: ");
            nimi = s.next();
            nimi = nimi.toUpperCase();
            nimiC++;

            if(nimi.equals("LUMI")){
                lumiC++;
            }

            
        }while(!nimi.equals("LOPPU"));
        if(nimiC > 1){nimiC--;}
        System.out.print(String.format("Nimiä oli %s kappaletta.\nNimi Lumi esiintyi %s kertaa.", nimiC, lumiC));
        
        s.close();
    }
}
