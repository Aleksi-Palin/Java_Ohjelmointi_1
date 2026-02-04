package Toistorakenne2;
import java.text.DecimalFormat;
import java.util.Scanner;

public class OpintolainaKorko {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("0.00");

        System.out.print("Anna lainan määrä: ");
        double laina = s.nextDouble();

        System.out.print("Anna korkoprosentti (esim. 5 tarkoittaa 5%): ");
        double prosentti = s.nextDouble();

        System.out.print("Anna kuukausien määrä: ");
        int kuukaudet = s.nextInt();

        s.close();

        double kuukausikorko = prosentti/100.0/12.0;

        double tulos = 0.0;

        for(int i = 1; i <= kuukaudet; i++){
            tulos += laina * kuukausikorko;
        }

        System.out.print("Kokonaiskorko " + kuukaudet + " kuukauden ajalta on: " + f.format(tulos) + " euroa");


    }
}
