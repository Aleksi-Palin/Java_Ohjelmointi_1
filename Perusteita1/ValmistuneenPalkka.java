package Perusteita1;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ValmistuneenPalkka{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Anna Veroprosentti: ");
        double Vpros = scan.nextDouble();
        DecimalFormat formatter = new DecimalFormat("0.00");
        System.out.println("Lasketaan summa, joka jää verojen jälkeen kun veroprosentti on " + formatter.format(Vpros)+"%.");

        System.out.println("Nettopalkka on: "+(formatter.format(Vpros / 2900)) );
        scan.close();
    }
}