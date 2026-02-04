package Merkkijono;
import java.util.Scanner;

public class Tuotteet {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Anna tuotenumero: ");
        int tuotenumero = s.nextInt();
        s.nextLine();
        
        System.out.print("Anna tuotteen nimi: ");
        String tuotenimi = s.nextLine();

        System.out.print("Anna tuotteen hinta: ");
        Double tuotehinta = s.nextDouble();
        s.nextLine();

        System.out.print("Anna tuotteen kuvaus: ");
        String tuotekuvaus = s.nextLine();

        tuotenimi = tuotenimi.strip().toUpperCase();

        System.out.println(String.format("\nNumero: %s\nNimi: %s\nHinta: %.2f", tuotenumero,tuotenimi,tuotehinta));

        if(tuotekuvaus.length() != 0){
            tuotekuvaus = tuotekuvaus.strip();
            System.out.print(String.format("Kuvaus: %s", tuotekuvaus));
        }

        s.close();
    }
}
