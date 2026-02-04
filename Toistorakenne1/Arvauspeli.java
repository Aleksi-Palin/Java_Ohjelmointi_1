package Toistorakenne1;
import java.util.Random;
import java.util.Scanner;

public class Arvauspeli {

    static Random satunnaisgeneraattori = new Random(); // älä muuta tätä riviä!

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        int answ;
        // Tämän satunnaisen luvun on oltava ohjelmasi oikea vastaus!
        int satunnaisluku = satunnaisgeneraattori.nextInt(100);
        System.out.print("Arvaa ajattelemani luku väliltä 0-99: ");
        answ = i.nextInt();

        if(answ != satunnaisluku){
            do{
                if(answ < satunnaisluku){
                    System.out.println("Oikea luku on suurempi kuin " + answ + "!");
                }else if(answ > satunnaisluku){
                    System.out.println("Oikea luku on pienempi kuin " + answ + "!");
                }

                System.out.print("Arvaa uudelleen: ");
                answ = i.nextInt();
                
            }while(answ != satunnaisluku);
        }
        i.close();
        System.out.println("Oikein!");
        



        // ...toteuta koodisi tänne
    }
}