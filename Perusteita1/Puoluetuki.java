import java.util.Scanner;

public class Puoluetuki {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Anna kansanedustajien lukumäärä: ");
        int Lukmar = scan.nextInt();

        int sum = 148175 * Lukmar;

        System.out.println("Puoluetuki on " + sum + " euroa");
        scan.close();
    }
}