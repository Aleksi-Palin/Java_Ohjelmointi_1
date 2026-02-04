package Taulukot;
import java.util.Scanner;

public class MerkkijononPalat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Kirjoita lause: ");
        String lause = s.nextLine();

        String[] jono = lause.split(" ");

        for(int i = 0; i < jono.length; i++){
            System.out.println(jono[i]);
        }

        s.close();
    }
}
