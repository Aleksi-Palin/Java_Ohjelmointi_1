package Perusteita2;
import java.util.Scanner;
import java.text.DecimalFormat;
import static java.lang.System.out; 


public class Bensa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("0.00");


        out.print("Anna tankattu määrä: ");
        double tankmar = input.nextDouble();

        out.print("Anna ajetut kilometrit: ");
        int kilometrit = input.nextInt();

        out.print("Anna litrahinta: ");
        double litrahinta = input.nextDouble();

        double tulos = (tankmar/kilometrit) * litrahinta;

        out.print("Ajo per kilometri maksaa " + formatter.format(tulos));

        input.close();
    }
}
