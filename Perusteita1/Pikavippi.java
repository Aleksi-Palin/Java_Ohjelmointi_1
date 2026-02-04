import java.util.Scanner;

public class Pikavippi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Anna lainasumma euroissa: ");
        double euro = scan.nextDouble();

        System.out.print("Montako vuotta (1 tai 2): ");
        int vuosi = scan.nextInt();

        System.out.print("Lainan korko (41% tai 37%): ");
        double korko = scan.nextDouble();

        double sum = ((euro * vuosi) * korko) / 100;

        System.out.println("Lainattu raha maksoi " + sum + " euroa");

        scan.close();
    }
}
