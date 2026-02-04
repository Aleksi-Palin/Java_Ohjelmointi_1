package Merkkijono;
import java.util.Scanner;

public class Lento {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Anna lennon numero: ");
        String numero = s.next();

        if(numero.startsWith("AY")){
            String sub = numero.substring(2,3);
            int numerot = Integer.parseInt(sub);
            
            if(numerot== 1){
                System.out.print("Kaukolento");
            }else if(numerot == 2 && numerot <= 6){
                System.out.print("Kotimaan lento");
            }else{
                System.out.print("Venäjän lento");
            }
        }else{
            System.out.print("Ei ole Finnairin lento");
        }

        s.close();
    }
}
