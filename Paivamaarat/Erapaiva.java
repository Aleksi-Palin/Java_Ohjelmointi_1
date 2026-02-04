package Paivamaarat;
import java.time.LocalDate;
import java.util.Scanner;

public class Erapaiva {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        LocalDate pvm;

        System.out.print("Anna laskun päivämäärä (vvvv-kk-pp): ");
        String input = s.nextLine();

        pvm = LocalDate.parse(input);
        
        LocalDate erapaiva =  pvm.plusDays(14);

        System.out.println("Eräpäivä on " + erapaiva);


        s.close();
    }
}
