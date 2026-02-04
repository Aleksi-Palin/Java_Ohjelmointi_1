package Perusteita1;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Maalaus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("0.00");

        System.out.print("Anna huoneen leveys, pituus ja korkeus: ");
        double Leveys = scan.nextDouble();
        double Pituus = scan.nextDouble();
        double Korkeus = scan.nextDouble();

        System.out.print("Montako neliötä maalaa litralla: ");
        double NelMetr = scan.nextDouble();

        double seina1 = 2 * (Korkeus * Pituus);
        double seina2 = 2 * (Korkeus * Leveys);

        double sum = (seina1 + seina2) / NelMetr;

        System.out.println("Maalia tarvitaan " +formatter.format(sum) + " litraa");


        scan.close();
    }
}
