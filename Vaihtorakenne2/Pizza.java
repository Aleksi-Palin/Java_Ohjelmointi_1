package Vaihtorakenne2;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Pizza {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("0.00");

        System.out.print("Anna pizzojen hinnat (3): ");
        double pizza1 = i.nextDouble();
        double pizza2 = i.nextDouble();
        double pizza3 = i.nextDouble();

        double halvin = pizza1;

        if(pizza2 < halvin){
            halvin = pizza2;
            
        }
        if(pizza3 < halvin){
                halvin = pizza3;
        }

        double summa = (pizza1 + pizza2 + pizza3) - halvin;

        double keskihinta = summa / 3;

        System.out.println("Maksettavaa: " + f.format(summa));
        System.out.print("Yksittäisen hinta: " + f.format(keskihinta));

        i.close();
    }
}
