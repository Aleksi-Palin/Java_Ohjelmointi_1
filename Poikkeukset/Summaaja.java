package Poikkeukset;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Summaaja {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int summa = 0;

        while(true){

            try{
                System.out.print("Syötä seuraava luku (0 lopettaa): ");
                int numero = s.nextInt();
                summa += numero;

                if(numero == 0){
                    System.out.println(String.format("\nLukujen summa on %s.", summa));
                    break;
                }

            }catch(InputMismatchException e){
                System.out.println("Virheellinen syöte!\n");
                s.nextLine();
            }
            
        }


        s.close();
    }
}
