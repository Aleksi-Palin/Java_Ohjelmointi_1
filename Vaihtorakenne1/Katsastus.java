package Vaihtorakenne1;
import java.util.Scanner;

public class Katsastus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hinta = 0;

        System.out.print("Onko 1=katsastus, 2=jälkitarkastus: ");
        int tarkistus = input.nextInt();

        if(tarkistus == 1){
            hinta += 50;
            System.out.print("Mitataanko päästöt 0=ei, 1=kyllä: ");
            int mittaus = input.nextInt();

            if(mittaus == 1){
                System.out.print("Onko auto 0=bensa, 1=diesel: ");
                int keitto = input.nextInt();

                if(keitto == 0){
                    hinta += 22;
                }else if(keitto == 1){
                    hinta += 31;
                }
            }
        }else if(tarkistus == 2){
            hinta += 30;
        }

        System.out.println("Hinta on " + hinta);
        
        
        input.close();
    }
}
