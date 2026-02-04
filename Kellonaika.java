
import java.util.Scanner;

public class Kellonaika {
    

    String kysyKellonaika(){
        Scanner s = new Scanner(System.in);
        System.out.print("Anna kellonaika muodossa tt:mm: ");
        String kellonAika = s.nextLine();
        s.close();
        return kellonAika;

    }

    boolean tarkastaKellonaika(String kellonaika){
        return kellonaika.matches("[0-24]{2}:[0-59]{2}");
        
    }

    public static void main(String[] args) {
        Kellonaika ka = new Kellonaika();
        boolean tarkastus = ka.tarkastaKellonaika(ka.kysyKellonaika());

        if(tarkastus){
            System.out.println("Kellonaika on oikein");
        }else{
            System.out.println("Kellonaika on väärin");
        }
    }
}
