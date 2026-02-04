package Toistorakenne1;
import java.util.Scanner;

public class Opintopisteet {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        System.out.print("Anna lukukausien määrä: ");
        int lukukaudet = i.nextInt();
        int opintopisteesi = 0;

        int tavoite = lukukaudet * 30;

        for(int y = 1; y <= lukukaudet; y++){
            System.out.println("Anna " + y + ". lukukauden opintopisteesi: ");
            opintopisteesi += i.nextInt();
        }

        System.out.println("Sinulla pitäisi olla tähän mennessä " + tavoite + " opintopistettä.");
        System.out.println("Sinulla on " + opintopisteesi + " opintopistettä.");

        if(opintopisteesi > tavoite){
            System.out.println("Olet edellä tavoitteesta.");
        }else if(opintopisteesi < tavoite){
            System.out.println("Olet jäljessä tavoitteesta.");
        }else{
            System.out.println("Olet tavoitteessa.");
        }

        int puuttuu = 210 - opintopisteesi;

        System.out.println("Tutkinnosta puuttuu vielä " + puuttuu + " opintopistettä.");

        i.close();
    }
}
