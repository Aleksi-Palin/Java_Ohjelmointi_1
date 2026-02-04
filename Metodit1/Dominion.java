
import java.util.Scanner;

public class Dominion {
    static int laskePisteet(int kirous, int tila, int pitaja, int laani){
        int summa = kirous * -1 + tila * 2 + pitaja * 3 + laani * 6;

        return summa;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Anna kirouskorttien määrä: ");
        int kirous = s.nextInt();

        System.out.print("Anna tilakorttien määrä:  ");
        int tila = s.nextInt();
        
        System.out.print("Anna pitäjäkorttien määrä: ");
        int pitaja = s.nextInt();
        
        System.out.print("Anna läänikorttien määrä: ");
        int laani = s.nextInt();

        int summa = Dominion.laskePisteet(kirous,tila,pitaja,laani);

        System.out.println("Pisteiden yhteismäärä on " + summa);
        s.close();
    }
}
