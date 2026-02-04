
import java.util.Scanner;

public class Tunnus {
    static String teeTunnus(String etu, String suku){
        String tunnus = String.join("", suku.toLowerCase().substring(0,3),etu.toLowerCase().substring(0,3));
        return tunnus;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Anna sukunimi: ");
        String suku = s.nextLine();

        System.out.print("Anna etunimi: ");
        String etu = s.nextLine();

        String tunnus = teeTunnus(etu, suku);

        System.out.println("Tunnus on " + tunnus);

        s.close();
    }
}
