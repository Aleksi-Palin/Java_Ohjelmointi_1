package Perusteita1;
import java.util.Scanner;
import java.text.DecimalFormat;

public class ALV {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("0.00");

        System.out.print("Anna tuotteet 1 hinta ilman ALVia: ");
        double hinta1 = input.nextDouble();
        System.out.println("Tuotteen 1 ALV on " + formatter.format((hinta1 *25.5) / 100) + " euroa.");

        System.out.print("Anna tuotteen 2 hinta ilman ALVia: ");
        double hinta2 = input.nextDouble();
        System.out.println("Tuotteen 2 ALV on " + formatter.format((hinta2 *25.5) / 100) + " euroa.");

        System.out.print("Anna tuotteen 3 hinta ilman ALVia: ");
        double hinta3 = input.nextDouble();
        System.out.println("Tuotteen 3 ALV on " + formatter.format((hinta3 *25.5) / 100) + " euroa.");

        input.close();

    }
}
