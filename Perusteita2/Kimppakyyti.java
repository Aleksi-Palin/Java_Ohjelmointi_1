package Perusteita2;
import java.text.DecimalFormat;
import java.util.Scanner;
import static java.lang.System.out; 

public class Kimppakyyti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("0.00");

        out.print("Anna ajetut kilometrit: ");
        int kilometrit = input.nextInt();

        out.print("Anna kulutus per 100 km: ");
        double perL = input.nextDouble();

        out.print("Anna polttoaineen litrahinta: ");
        double litrahinta = input.nextDouble();

        out.print("Anna kimppakyytiläisten lukumäärä: ");
        int kyytilaiset = input.nextInt();

        double tulos = (double) (kilometrit * perL / 100.0 * litrahinta / kyytilaiset);

        out.print("Bensakustannus per henkilö on " + formatter.format(tulos) + " euroa");
        input.close();
    }
}
