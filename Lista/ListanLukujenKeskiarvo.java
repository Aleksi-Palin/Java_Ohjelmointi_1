package Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ListanLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<Integer> luvut = new ArrayList<Integer>();

        int summa = 0;

        System.out.println("Syötä kokonaislukuja listalle (-1 lopettaa):");

        while (true) {
            int syote = lukija.nextInt();

            if (syote == -1) {
                break;
            } else {
                luvut.add(syote);
                summa += syote;
            }
        }
        lukija.close();

        System.out.println(); // Tyhjä rivi tulosteeseen

        
        double tulos =(double) summa / luvut.size();

        System.out.println("Keskiarvo: " + tulos); // Keskiarvoa ei tule pyöristää!
    }
}