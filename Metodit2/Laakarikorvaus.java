package Metodit2;
import java.util.Scanner;

public class Laakarikorvaus {
    static double laskeKorvaus(int kesto){
        double hinta = 0.0;
        if(kesto <= 10){
            hinta = 8.00;
        }else if(kesto <= 20){
            hinta = 11.00;
        }else if(kesto <= 30){
            hinta = 13.50;
        }
        return hinta;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Anna käynnin kesto: ");
        int kesto = s.nextInt();

        double hinta = laskeKorvaus(kesto);

        System.out.println(String.format("Kestoltaan %s minuutin yleislääkärikäynnistä kelakorvaus on %.2f euroa", kesto,hinta));

        s.close();
    }
    
}
