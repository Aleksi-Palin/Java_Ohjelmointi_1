
import java.util.Scanner;

public class Kulutus {
    static Scanner s = new Scanner(System.in);

    static int kysyKilometrit(){
        System.out.print("Anna ajetut kilometrit: ");

        return s.nextInt();
    }

    static double kysyTankkaus(){
        System.out.print("Anna tankattu määrä: ");
        return s.nextDouble();
    }

    static double laskeKulutus(int kilometrit, double tankattu){
        double tulos = (tankattu / kilometrit) * 100;
        return tulos;
    }

    static void naytaKulutus(double kulutus){
        System.out.println(String.format("Kulutus/100km on %.2f litraa", kulutus));
    }

    public static void main(String[] args) {
        double lasku = laskeKulutus(kysyKilometrit(), kysyTankkaus());
        naytaKulutus(lasku);
    }

    
}
