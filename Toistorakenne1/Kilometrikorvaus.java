package Toistorakenne1;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Kilometrikorvaus {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("0.00");

        int answ;
        int kilometrit = 0;
        do{
            System.out.print("Anna ajetut kilometrit (0 lopettaa): ");
            answ = i.nextInt();

            kilometrit += answ;
        }while(answ != 0);
        i.close();

        System.out.println("Yhteensä " + kilometrit + " kilometriä");

        double korvaus = kilometrit * 0.43;

        System.out.println("Korvaus on " + f.format(korvaus) + " euroa");
    }
}
