package Toistorakenne2;

import java.util.Scanner;

public class Arvaus {
    
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        int answ;
        
        // Tämän satunnaisen luvun on oltava ohjelmasi oikea vastaus!
        System.out.print("Arvaa lukua väliltä 1-100: ");
        answ = i.nextInt();
        int arvaukset = 1;
        if(answ != 78){
            do{
                arvaukset++;
                if(answ < 78){
                    System.out.print("Arvaa suurempaa: ");
                    answ = i.nextInt();
                }else if(answ > 78){
                    System.out.print("Arvaa pienempää: ");
                    answ = i.nextInt();
                }
                
                
            }while(answ != 78);
        }
        i.close();
        System.out.println("Arvasit oikein. Arvauksia oli " + arvaukset);
    }
}
