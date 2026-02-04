package Perusteita2;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Alennus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("0.00");

        System.out.print("Anna alentamaton hinta: ");
        double hinta = input.nextDouble();

        System.out.print("Anna alennusprosentti: ");
        int prosentti = input.nextInt();

        double tulos = hinta * (100.0 - prosentti) / 100.0;

        System.out.print("Alennettu hinta on " + formatter.format(tulos));

        input.close();
    }
}
