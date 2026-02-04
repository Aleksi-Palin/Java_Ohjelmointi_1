package Toistorakenne2;
import java.text.DecimalFormat;
import java.util.Scanner;

public class AsuntolainaKorko {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("0.00");

        System.out.print("Anna lainamäärä: ");
        Double laina = s.nextDouble();

        System.out.print("Anna vuosikorkoprosentti: ");
        Double korkoprosentti = s.nextDouble();

        System.out.print("Anna laina-aika vuosina: ");
        int lainaAika = s.nextInt();

        s.close();

        for (int i = 0; i < lainaAika; i++) {
            laina *= (1 + korkoprosentti / 100);
        }

        System.out.print("Lopullinen lainamäärä on: " + f.format(laina) + " euroa.");
    }
}
