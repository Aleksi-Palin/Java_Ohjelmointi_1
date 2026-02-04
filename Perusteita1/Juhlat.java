package Perusteita1;
import java.util.Scanner;

public class Juhlat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Anna vieraiden lukumäärä: ");
        int Vieraat = input.nextInt();

        input.close();
        double temp = (double) Vieraat / 7;
        
        int pulloja = (int) Math.ceil(temp);
        int Ylim = ((pulloja * 7 ) - Vieraat) * 1;

        System.out.print("Pulloja tarvitaan " + pulloja + " kappaletta");
        System.out.print("Viimeisestä pullosta jää " + Ylim + " lasillista");


    }
}
