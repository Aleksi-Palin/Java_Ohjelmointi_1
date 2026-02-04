package Taulukot;
import java.util.Scanner;

public class SanojenVaihtaminen {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Kirjoita lause:");
        String lause = s.nextLine();

        System.out.println("\nMitkä sanat vaihdetaan keskenään?");
        int index1 = s.nextInt();
        int index2 = s.nextInt();

        String[] jono = lause.split(" ");

        String sana1 = jono[index1];
        String sana2 = jono[index2];
        
        jono[index1] = sana2;
        jono[index2] = sana1;

        lause = String.join(" ",jono);
        System.out.println("\n" + lause);

        s.close();
    }
}
