package LuokkaJAolio1;

import java.util.Scanner;

public class RemonttiOhjelma {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Remontti remontti = new Remontti();

        System.out.print("Anna vuosi: ");
        int vuosi = s.nextInt();
        s.nextLine();


        if(!remontti.setVuosi(vuosi)){
            System.out.print("Vuosi ei voi olla tulevaisuudessa");
        }else{
            System.out.print("Anna kuvaus: ");
            String kuvaus = s.nextLine();

            remontti.setKuvaus(kuvaus);

            System.out.println(remontti);

        }
        
        s.close();
    }
}
