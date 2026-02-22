package Metodit2;

import java.util.Scanner;

public class Veriryhma {

    int kysyVeriryhmat(String[] bloodTypes,int[] counts,Scanner s){

        
        int luovutuslkm = 0;

        while(true){
            System.out.print("Anna veriryhmä (- lopettaa): ");
            String vastaus = s.nextLine();

            if(vastaus.equals("-")){
                break;
            }else{
                for(int i = 0; i < bloodTypes.length; i++){
                    if(bloodTypes[i].equals(vastaus)){
                        counts[i]++;
                    }
                }
                luovutuslkm++;
            }
        }
       
        return luovutuslkm;
    }

    void kerroVeriRyhmaMaara(String[] bloodTypes,int[] counts,String veriryhmatyyppi){
        for(int i = 0; i < bloodTypes.length; i++){
            if(bloodTypes[i].equals(veriryhmatyyppi)){
                System.out.println(String.format("Veriryhmän %s luovutuksia oli %s", veriryhmatyyppi,counts[i]));
            }
        }
    }

    public static void main(String[] args) {
        Veriryhma v = new Veriryhma();
        Scanner s = new Scanner(System.in);
        
        String[] bloodTypes = {"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"};
        int[] counts = new int[8];
        
        int luovutuslkm = v.kysyVeriryhmat(bloodTypes,counts,s);

        System.out.println("Luovutuksia oli yhteensä " + luovutuslkm);

        System.out.print("Minkä veriryhmän luovutusten määrän haluat tietää: ");
        String veriryhmatyyppi = s.nextLine();

        v.kerroVeriRyhmaMaara(bloodTypes,counts,veriryhmatyyppi);

        s.close();
    }
}
