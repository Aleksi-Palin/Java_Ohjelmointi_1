package Poikkeukset;
import java.util.Scanner;

public class ArvonTarkastus {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try{
            System.out.print("Syötä luku väliltä 0-23: ");
            int numero = s.nextInt();

            if(numero < 0 || numero > 23){
                s.close();
                throw new IllegalArgumentException();
                
            }else{
                System.out.print("Luku " + numero + " on sallittu.");
            }
           

        }catch(IllegalArgumentException e){
            throw e;
        }

        s.close();
    }
}
