package Merkkijono;
import java.util.Scanner;

public class Salasana {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Anna salasana:");
        String salasana = s.nextLine();

        if(salasana.chars().anyMatch(Character::isDigit)){
            if(salasana.chars().anyMatch(Character::isUpperCase) && salasana.chars().anyMatch(Character::isLowerCase)){
                if(salasana.length() > 8){
                    System.out.println("Salasana kelpaa.");
                }else{
                    System.out.println("Salasana ei käy.");
                }
            }else{
                System.out.println("Salasana ei käy.");
            }

        }else{
            System.out.println("Salasana ei käy.");
        }

        s.close();
    }
}
