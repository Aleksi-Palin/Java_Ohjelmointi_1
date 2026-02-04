package Vaihtorakenne2;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Matkavertailu {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("0.00");

        System.out.print("Montako matkaa teet kuukaudessa: ");
        int matkat = i.nextInt();

        System.out.print("Anna yksittäisen lipun hinta: ");
        double lipunhinta = i.nextDouble();

        System.out.print("Anna kuukausilipun hinta: ");
        double kklipunhinta = i.nextDouble();

        double yksittaistenhinta = matkat * lipunhinta;

        double hinta = 0;

        if(kklipunhinta < yksittaistenhinta){
            hinta = yksittaistenhinta - kklipunhinta;
            System.out.print("Kuukausilippu on " + f.format(hinta)+ " euroa halvempi kuin yksittäinen");
        }else{
            hinta = kklipunhinta - yksittaistenhinta;
            System.out.print("Yksittäinen on " + f.format(hinta)+ " euroa halvempi kuin Kuukausilippu");
        }

        i.close();
    }
}
