package Vaihtorakenne1;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Peltipoliisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("0.00");

        System.out.print("Anna nopeutesi: ");
        int nopeus = input.nextInt();

        if(nopeus <= 80){
            System.out.println("Ei sakkoja");
        }else if(nopeus > 80 && nopeus < 100){
            System.out.println("Rikesakko");
        }else{
            System.out.println("Päiväsakko");
            System.out.print("Anna nettokuukausitulosi: ");
            double tulot = input.nextDouble();

            double tulos = (tulot - 255)/60;

            if(tulos < 6){
                tulos = 6;
            }

            System.out.print("Päiväsakon määrä on " + formatter.format(tulos) + " euroa");
        }

        input.close();
    }
}
