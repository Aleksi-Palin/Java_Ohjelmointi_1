package Toistorakenne1;
import java.util.Scanner;

public class Alkuluku {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        System.out.print("Syötä jokin positiivinen kokonaisluku: ");
        int luku = i.nextInt();
        i.close();

        boolean OnAlkuLuku = true;

        for(int x = 2; x < luku; x++){
            if(luku % x == 0){
               OnAlkuLuku = false;
                break;
            }
        }

        if(OnAlkuLuku){
            System.out.println("Luku " + luku + " on alkuluku.");
        }else{
            System.out.println("Luku " + luku + " ei ole alkuluku.");
        }
    }
}
