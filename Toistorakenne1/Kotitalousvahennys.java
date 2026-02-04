package Toistorakenne1;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Kotitalousvahennys {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("0.00");

        double answ;
        double sum = 0.0;
        
        do{
            System.out.print("Anna työkorvauksen määrä (0 lopettaa): ");
            answ = i.nextDouble();

            sum += answ;
            
        }while(answ != 0);
        i.close();

        double KtalousVah = (sum * 50 / 100.0) - 100;

        if(KtalousVah > 2400){
            KtalousVah = 2400.0;
        }else{KtalousVah = 0.0;}

        System.out.print("Kotitalousvähennyksen määrä on " + f.format(KtalousVah) +" euroa");
            
    }
}
