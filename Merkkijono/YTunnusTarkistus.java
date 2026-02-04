package Merkkijono;
import java.util.Scanner;

public class YTunnusTarkistus {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String Ytunnus;

        int[] kertoimet = {7, 9, 10, 5, 8, 4, 2};
        // int tarkistusnumero = 0;
        // String[] jako;
        // int jakojaannos = 0;
        int summa = 0;
       

        for(int i = 1; i <= 8; i++){
            System.out.println(String.format("Anna %s.  Y-tunnus (muodossa 1234567-8):", i));
            Ytunnus = s.nextLine();

            

            String[] jako = Ytunnus.split("-");

            int tarkistusnumero = Integer.parseInt(jako[1]);

            //System.out.println("Tarkistusnumero: " + tarkistusnumero);

            char[] integers = jako[0].toCharArray();
            for(int x = 0; x < 7; x++){
                summa += ((integers[x] - '0') * kertoimet[x]);
                
            }
   
            int jakojaannos = summa % 11;
            summa = 0;

            if(jakojaannos >= 2 && jakojaannos <= 10){
                jakojaannos = 11 - jakojaannos;
            }


            if(tarkistusnumero == jakojaannos){
                System.out.println(String.format("Tunnus %s-%s => Oikein\n", jako[0],jako[1]));
            }else{
                System.out.println(String.format("Tunnus %s-%s => Väärin\n", jako[0],jako[1]));
            }

        }

        s.close();
    }
}
