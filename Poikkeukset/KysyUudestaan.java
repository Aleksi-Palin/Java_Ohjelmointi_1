package Poikkeukset;
import java.util.InputMismatchException;
import java.util.Scanner;

public class KysyUudestaan {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while(true){

            try{
                System.out.print("Syötä kokonaisluku: ");
                int numero = s.nextInt();

                System.out.println("Syötit luvun " + numero + ".");
                break;

            }catch(InputMismatchException e){
                System.out.println("Virheellinen luku!\n");
                s.nextLine();
            }
            
        }


        s.close();
    }
}
