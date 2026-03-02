package LuokkaJAolio2;

import java.util.Scanner;

public class KokoOhjelma {
    
    public static void main(String[] args) {

        Koko koko = new Koko();

        Scanner s = new Scanner(System.in);

        System.out.print("Anna pituus metreinä: ");
        double pituus = s.nextDouble();

        System.out.print("Anna paino kiloina: ");
        int paino = s.nextInt();
        

        koko.setPituus(pituus);
        koko.setPaino(paino);

        System.out.print("Pituus: " + koko.getPituus());
        System.out.print("Paino: " + koko.getPaino());
        System.out.print("Painoindeksi: " + koko.getPainoindeksi());

        s.close();
        
    }
}
