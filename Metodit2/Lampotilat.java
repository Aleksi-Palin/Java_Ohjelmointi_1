package Metodit2;
import java.util.Scanner;
import java.util.Arrays;

public class Lampotilat {

    int kysyLampotilat(int[] lampotilat, final int MAX){

        Scanner s = new Scanner(System.in);
        int lkm = 0;
        for(int i = 0; i < MAX; i++){
            System.out.print("Anna lämpötila: ");
            int lampotila = s.nextInt();
            if(lampotila == -999){
                break;
            }else{
                lampotilat[i] = lampotila;
                lkm++;
            }

            
        }
        
        s.close();
        return lkm;

    }

    void naytaLampotilat(int[] lampotilat, int lkm){
        Arrays.sort(lampotilat,0,lkm);

       String[] strArray = Arrays.stream(lampotilat, 0, lkm)
                          .mapToObj(String::valueOf)
                          .toArray(String[]::new);

        System.out.print("Annoit lämpötilat: "+ String.join(" ", strArray));
    }


    public static void main(String[] args){
        Lampotilat l = new Lampotilat();
        int[] numarray = new int[100];

        int lkm = l.kysyLampotilat(numarray,100);

        l.naytaLampotilat(numarray, lkm);
    }
}