package Perusteita2;
import java.util.Scanner;
import static java.lang.System.out; 

public class Paivasakko {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        out.print("Anna nettotulot: ");
        int nettotulot = input.nextInt();

        int tulos = (nettotulot - 255) / 60;

        out.print("Nettotuloilla " + nettotulot + " päiväsakko on " + tulos + " euroa");
        input.close();
    }
}
