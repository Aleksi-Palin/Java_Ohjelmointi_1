package Poikkeukset;
import java.time.LocalTime;

public class Kello {

    int tunnit, minuutit;
    LocalTime kellonaika;

    
    Kello(int tunnit, int minuutit){
        if(tunnit < 0 || tunnit > 23 || minuutit < 0 || minuutit > 59){
            throw new IllegalArgumentException("Virheellinen kellonaika");
        }
        this.tunnit = tunnit;
        this.minuutit = minuutit;

        kellonaika = LocalTime.of(tunnit, minuutit);
        
    }

    public void setTunnit(int tunnit){
        if(tunnit < 0 || tunnit > 23){
            throw new IllegalArgumentException("Virheelliset tunnit");
        }
        this.tunnit = tunnit;
        kellonaika = LocalTime.of(this.tunnit,this.minuutit);
        
    }

    public void setMinuutit(int minuutit){
        if(minuutit < 0 || minuutit > 59){
            throw new IllegalArgumentException("Virheelliset minuutit");
        }
        this.minuutit = minuutit;
        kellonaika = LocalTime.of(this.tunnit,this.minuutit);
        
    }

    public void lisaaMinuutit(int mins){

        if(mins < 0){
            throw new IllegalArgumentException("Negatiivinen luku");
        }else{

            kellonaika = kellonaika.plusMinutes(mins);

            tunnit = kellonaika.getHour();
            minuutit = kellonaika.getMinute();

        }
        

    }

    public String toString(){
        return String.format("%s:%02d", tunnit,minuutit);
    }
    
}

class KelloTest{
    public static void main(String[] args) {
        Kello kello = new Kello(22,12);
        System.out.println(kello);

        kello.lisaaMinuutit(40);
        System.out.println(kello);

        kello.lisaaMinuutit(29);
        System.out.println(kello);

        kello.lisaaMinuutit(45);
        System.out.println(kello);
    }
}
