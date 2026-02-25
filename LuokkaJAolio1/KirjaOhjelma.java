package LuokkaJAolio1;

import java.util.Scanner;


public class KirjaOhjelma {

    Kirja kirja = null;

    private void teeKirja(){
        Scanner lukija = new Scanner(System.in);

        System.out.print("Anna nimi: ");
        String nimi = lukija.nextLine();

        System.out.print("Anna isbn: ");
        String isbn = lukija.nextLine();

        System.out.print("Anna hinta: ");
        double hinta = lukija.nextDouble();

        System.out.print("Anna julkaisuvuosi: ");
        int julkaisuvuosi = lukija.nextInt();

        lukija.close();

        kirja = new Kirja(nimi, isbn, hinta, julkaisuvuosi);

    }
    
    public static void main(String[] args) {
        

        KirjaOhjelma k = new KirjaOhjelma();

        k.teeKirja();
        
        Kirja kirja2 = k.kirja;

        System.out.println(kirja2.toString());

        System.out.println("Nimi: " + kirja2.getNimi());
        System.out.println("Isbn: " + kirja2.getIsbn());    
        System.out.println("Hinta: " + String.format("%.2f", kirja2.getHinta()).replace(".", ","));
        System.out.println("Julkaisuvuosi: " + kirja2.getJulkaisuvuosi());
        

    }
}

