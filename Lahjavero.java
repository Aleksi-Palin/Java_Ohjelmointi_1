
import java.util.Scanner;

public class Lahjavero {
    public static double laskeVero(double arvo){
        double tulos = 0;

        if(arvo > 5000 && arvo < 25000){
            tulos = 100 + (arvo - 5000) * 0.08  ;

        }else if(arvo > 25000 && arvo < 55000){
            tulos = 1700 + (arvo - 25000) * 0.10 ;

        }else if(arvo > 55000 && arvo < 200000){
            tulos = 4700 + (arvo - 55000 )* 0.12 ;

        }else if(arvo > 200000 && arvo < 1000000){
            tulos = 22100 + (arvo - 200000) * 0.15 ;

        }else if(arvo >= 1000000){
            tulos = 142100 + (arvo - 1000000) * 0.17;

        }

        return tulos;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Anna lahjan suuruus: ");
        double lahja = s.nextDouble();

        double vero = laskeVero(lahja);

        System.out.println(String.format("Lahja vero on %.2f euroa", vero));

        s.close();
    }
}
