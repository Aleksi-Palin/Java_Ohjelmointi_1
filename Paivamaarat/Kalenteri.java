package Paivamaarat;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;

public class Kalenteri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Syötä vuosi: ");
        int vuosi = s.nextInt();

        System.out.print("Syötä kuukausi: ");
        int kk = s.nextInt();

        YearMonth kalenteri = YearMonth.of(vuosi, kk);
        LocalDate paiva = LocalDate.of(vuosi,kk,1);
        int alkuOffset = paiva.getDayOfWeek().getValue() - 1;

        System.out.println("Ma Ti Ke To Pe La Su");
        System.out.print("   ".repeat(alkuOffset));
        for(int i = 1; i <= kalenteri.lengthOfMonth(); i++){
            System.out.printf("%2d ",i);

            if((i + alkuOffset) % 7 == 0){
                System.out.println("");
            }
            
        }

        s.close();
    }
}
