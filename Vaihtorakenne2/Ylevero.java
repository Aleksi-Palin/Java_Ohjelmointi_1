package Vaihtorakenne2;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ylevero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("0.00");

        System.out.print("Anna vuositulosi ja ikäsi: ");
        double vuositulot = input.nextDouble();
        int ika = input.nextInt();

        double VeroSum = (vuositulot * 0.68) / 100;

        if(ika >= 18 && VeroSum >= 70){
            if(VeroSum > 140){
                VeroSum = 140;
            }
            System.out.print("Ylevero on " + f.format(VeroSum));
        }else{
            System.out.print("Ylevero on 0,00");
        }

        input.close();
    }
}
