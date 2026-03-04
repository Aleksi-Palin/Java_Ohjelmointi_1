package LuokkaJAolio2;

import java.util.Scanner;

public class HenkiloSovellus {

    public void kysyHenkiloTietoja(Scanner lukija,Henkilo henkilo){
        System.out.print("Anna nimi: ");
        String nimi = lukija.nextLine();

        System.out.print("Anna osoite: ");
        String osoite = lukija.nextLine();

        henkilo.setNimi(nimi);
        henkilo.setOsoite(osoite);
    }
    public static void main(String[] args) {
        HenkiloSovellus hk = new HenkiloSovellus();
        Scanner lukija = new Scanner(System.in);
        Henkilo henkilo = null;
        boolean jatkuu = true;

        while (jatkuu) {
            System.out.println("1. Anna henkilö");
            System.out.println("2. Näytä henkilön tiedot");
            System.out.println("3. Muuta henkilön tietoja");
            System.out.println("0. Lopetus");
            System.out.print("Anna valintasi (0-3): ");

            int vastaus = lukija.nextInt();
            lukija.nextLine();

            switch (vastaus) {
                case 0:
                    jatkuu = false;
                    break;
                case 1:
                    if (henkilo == null) {
                        henkilo = new Henkilo();
                    }
                    hk.kysyHenkiloTietoja(lukija, henkilo);
                    break;
                case 2:
                    if (henkilo == null) {
                        System.out.println("Henkilöä ei ole");
                    } else {
                        System.out.println("Nimi=" + henkilo.getNimi() + ", osoite=" + henkilo.getOsoite());
                    }
                    break;
                case 3:
                    if (henkilo == null) {
                        System.out.println("Henkilöä ei ole");
                    } else {
                        hk.kysyHenkiloTietoja(lukija, henkilo);
                    }
                    break;
                default:
                    break;
            }

            System.out.println();
        }

        lukija.close();
    }
}
