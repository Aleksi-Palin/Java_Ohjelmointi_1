package Toistorakenne2;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Luottolaskuri {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("0.00");

        System.out.print("Anna luotollisen ostoksen hinta: ");
        double hinta = i.nextDouble();

        System.out.print("Anna kuukausierien lukumäärä: ");
        int kuukaudet = i.nextInt();
        
        i.close();

        double kuukausierat = (double) hinta / kuukaudet;
        double luotto = hinta;

        for(int x = 1; x <= kuukaudet; x++){
            luotto -= kuukausierat;
            System.out.println(x + ". erä " + f.format(kuukausierat) + " euroa, luottoa jäljellä " + f.format(luotto) + " euroa");
        }
    }
}
