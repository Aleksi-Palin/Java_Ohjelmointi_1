package Perusteita1;
import java.util.Scanner;

public class Cooper{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Anna juostu matka: ");

        int matka = input.nextInt();

        int vastaus = matka / 400;

        System.out.println("Kokonaisia 400 metrin kierroksia " + vastaus);

        input.close();
    }
}