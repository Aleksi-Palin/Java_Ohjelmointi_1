package Taulukot;
import java.util.Arrays;
import java.util.Scanner;

public class MarsinLampotilat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] lampotilat = new int[10];
        double summa = 0;

        for (int i = 0; i < lampotilat.length; i++) {
            System.out.print(String.format("Syötä mittaus %s/10: ", i+1));
            int lampotila = s.nextInt();

            if(lampotila < -140 || lampotila > 20){
                System.out.println("Anna lämpötila väliltä -140 - +20!\n");
                i--;
            }else{
                lampotilat[i] = lampotila;
                summa += lampotila;
            }
            
            
        }

        System.out.println("Mittausten keskiarvo: " + (summa / lampotilat.length));
        System.out.println("Pienin mittaustulos: " + Arrays.stream(lampotilat).min().getAsInt());
        System.out.println("Suurin mittaustulos: " + Arrays.stream(lampotilat).max().getAsInt());

        s.close();
    }
}
