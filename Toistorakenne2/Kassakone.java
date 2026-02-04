package Toistorakenne2;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Kassakone {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("0.00");

        double answ;
        double sum = 0.0;
        
        do{
            System.out.print("Anna ostoksen hinta (0 lopettaa): ");
            answ = i.nextDouble();

            sum += answ;
            
        }while(answ != 0);
        i.close();

        double alv = sum * 24.0 / 124.0;
        double veroton = sum - alv;

        System.out.println("Ostosten verollinen hinta on " + f.format(sum));
        System.out.println("ALV:n osuus on " + f.format(alv));
        System.out.println("Veroton hinta on " + f.format(veroton));

    }
}
