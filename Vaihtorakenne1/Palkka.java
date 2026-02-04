package Vaihtorakenne1;
import java.text.DecimalFormat;
import java.util.Scanner;
import static java.lang.System.out; 

public class Palkka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("0.00");


        out.print("Anna palkka: ");
        int palkka = input.nextInt();

        out.print("Anna veroprosentti: ");
        int veroprosentti = input.nextInt();

        out.print("Anna ikä: ");
        int ika = input.nextInt();

        out.print("Bruttopalkka " + formatter.format(palkka));

        double vero = palkka * veroprosentti / 100.0;
        out.print("Veron osuus " + formatter.format(vero));

        double tyoelakeprosentti = 0.0675;
        if(ika >= 53 && ika <= 62){
            tyoelakeprosentti = 0.0825;
        }

        double tyoelake = palkka * tyoelakeprosentti;
        out.print("Työeläkevakuutusmaksun osuus " + formatter.format(tyoelake));

        double tyottomyys = palkka * 0.015;
        out.print("Työttömyysvakuutuksen osuus " + formatter.format(tyottomyys));

        double kateen = palkka - vero - tyoelake - tyottomyys;
      
        out.print("Käteen jää " + formatter.format(kateen));

        input.close();
    }
}
