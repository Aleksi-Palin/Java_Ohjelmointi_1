package Metodit2;

import java.util.Scanner;

public class Sairaspaivaraha {

    public double kysyvuositulo(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Anna vuositulosi: ");
        double vuositulot = scan.nextDouble();

        scan.close();
       return vuositulot;
    }

    public double laskeSairaspaivaraha(double vuositulo){
        if (vuositulo <= 1399) {
            return 0.0;
        } else if (vuositulo <= 36419) {
            return 0.7 * vuositulo / 300.0;
        } else if (vuositulo <= 56032) {
            return 84.98 + 0.4 * (vuositulo - 36419) / 300.0;
        } else {
            return 111.13 + 0.25 * (vuositulo - 56032) / 300.0;
        }
    }

    public static void main(String[] args) {
        Sairaspaivaraha s = new Sairaspaivaraha();
        double tulo = s.kysyvuositulo();
        double sairaspaivaraha = s.laskeSairaspaivaraha(tulo);

        System.out.println(String.format("Vuosituloilla %.2f sairaspäiväraha on %.2f euroa/päivä.", tulo,sairaspaivaraha));
    }
}
