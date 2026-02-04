package Perusteita2;
import java.util.Scanner;
import static java.lang.System.out; 
import java.text.DecimalFormat;


public class Matka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("0.00");

        out.print("Anna matka: ");
        int matka = input.nextInt();

        out.print("Anna nopeus: ");
        int nopeus = input.nextInt();

        double tulos = (double) matka/nopeus;

        out.print(("Aikaa menee " + formatter.format(tulos)  + " tuntia").replace('.', ','));

        input.close();
    }
}
