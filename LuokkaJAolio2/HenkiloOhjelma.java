package LuokkaJAolio2;

import java.util.Scanner;

public class HenkiloOhjelma {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Anna nimi: ");
        String nimi = s.nextLine();

        System.out.print("Anna osoite: ");
        String osoite = s.nextLine();

        s.close();

        Henkilo henkilo = new Henkilo();

        henkilo.setNimi(nimi);
        henkilo.setOsoite(osoite);

        System.out.print("Nimi: " + henkilo.getNimi() + "\nOsoite: " + henkilo.getOsoite());
    }
}
