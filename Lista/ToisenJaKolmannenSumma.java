package Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToisenJaKolmannenSumma {
    
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<Integer> luvut = new ArrayList<Integer>();

        System.out.println("Syötä kokonaislukuja listalle (0 lopettaa):");

        while (true) {
            // Syötetty merkkijono voidaan muuttaa kokonaisluvuksi
            // myös Integer.parseInt-metodilla
            int syote = Integer.parseInt(lukija.nextLine());

            if (syote == 0) {
                break;
            } else {
                luvut.add(syote);
            }
        }

        lukija.close();

        System.out.println(); // Tyhjä rivi tulosteeseen

        // TODO: Muokkaa alla olevaa koodia tehtävänannon mukaisesti
        int eka = luvut.get(1);
        int toka = luvut.get(2);

        // Hienosti erikseeen
        int summa = eka + toka;
        System.out.println(summa);
    }
}
