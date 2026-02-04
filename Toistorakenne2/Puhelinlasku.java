package Toistorakenne2;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Puhelinlasku {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("0.00");

        System.out.println("Anna rahasumma puhelinlaskulle 1");
        String lasku1 = i.nextLine();

        System.out.println("Anna rahasumma puhelinlaskulle 2");
        String lasku2 = i.nextLine();

        i.close();

        double summa = Double.parseDouble(lasku1) + Double.parseDouble(lasku2);
        
        System.out.print("Haluttu yhteissumma lukuna on " + f.format(summa) + " euroa");
        
    }
}
