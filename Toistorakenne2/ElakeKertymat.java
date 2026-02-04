package Toistorakenne2;

import java.util.Scanner;

public class ElakeKertymat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        
        double Elakekertyma = 0.0;

        System.out.print("Anna työvuotesi: ");
        int vuodet = s.nextInt();

        System.out.print("Anna syntymävuotesi: ");
        //int syntymavuosi = s.nextInt();

        for(int i = 1; i <= vuodet; i++){
            System.out.print("Anna vuosipalkka vuodelta " + i + ": ");
            Double palkka = s.nextDouble();

            Elakekertyma += (palkka * (1.5 / 100));
        }

        System.out.print("Eläkekertymäsi on: " + Elakekertyma + " euroa.");

        s.close();
    }
}
