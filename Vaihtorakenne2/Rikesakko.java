package Vaihtorakenne2;
import java.util.Scanner;

public class Rikesakko {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int sakkomaara = 0;
        
        System.out.print("Anna nopeusrajoitus: ");
        int rajoitus = i.nextInt();

        System.out.print("Anna nopeutesi: ");
        int nopeus = i.nextInt();

        int erotus = nopeus - rajoitus;

        if(erotus >= 30){
                System.out.println("Menee päiväsakoille");
        }
        else{
            if(rajoitus >= 10 && rajoitus <= 60){
                if(erotus <= 15){
                sakkomaara = 170;
                }
            else if(erotus > 15 && erotus <= 20){
                sakkomaara = 200;
            }

            }else if(rajoitus >= 70 && rajoitus <= 120){
                if(erotus <= 15){
                sakkomaara = 140;
                }
                else if(erotus > 15 && erotus <= 20){
                sakkomaara = 200;
                }
            }

            System.out.println("Rikesakko on " + sakkomaara);

        }



        

        i.close();
    }
}
