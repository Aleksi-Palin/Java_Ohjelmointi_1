package Paivamaarat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;
import java.util.Scanner;

public class Juhannus {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d.M.yyyy");
        System.out.print("Syötä vuosi: ");
        String vuosi = s.nextLine();

        String yhdistys = vuosi + "-06-20";
        
        LocalDate pvm = LocalDate.parse(yhdistys);
        LocalDate pluspvm = pvm;
        
        
       for (int i = 0; i < 7; i++) {

            if (pluspvm.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println("\nJuhannus on " + dtf.format(pluspvm) + ".");
                break;
            }

            pluspvm = pluspvm.plusDays(1);
        }

        s.close();
    }
}
