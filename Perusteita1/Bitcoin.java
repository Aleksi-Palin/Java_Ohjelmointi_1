package Perusteita1;
import java.util.Scanner;

public class Bitcoin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Anna määrä jolla ostit Bitcoineja: ");

        double Maara = scan.nextDouble();

        double sum = Maara * 15.06;

        System.out.println("Bitcoin tuotti vuodessa " + (sum - Maara) + " euroa");
        scan.close();
    }
}
