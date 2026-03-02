package LuokkaJAolio1;

import java.time.LocalDate;

public class Remontti {
    private int vuosi;
    private String kuvaus;

    public Remontti(int vuosi, String kuvaus){
        this.vuosi = vuosi;
        this.kuvaus = kuvaus;
    }

    public Remontti(){
        this.vuosi = LocalDate.now().getYear();
    }

    public boolean setVuosi(int vuosi){

        if(vuosi > LocalDate.now().getYear()){
            return false;
        }else{
            this.vuosi = vuosi;
            return true;
        }
        
    }

    public int getVuosi(){
        return this.vuosi;
    }

    public void setKuvaus(String kuvaus){
        this.kuvaus = kuvaus;
    }

    public String getKuvas(){
        return this.kuvaus;
    }

    @Override
    public String toString(){
        return String.format("Vuonna %s tehtiin remontti %s", this.vuosi,this.kuvaus);
    }
    
}
