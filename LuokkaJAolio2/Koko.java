package LuokkaJAolio2;

public class Koko {

    private double pituus;
    private int paino;

    public Koko(double pituus, int paino){
        this.pituus = pituus;
        this.paino = paino;
    }
    public Koko(){
        this.pituus = 0.0;
        this.paino = 0;
    }

    public void setPituus(double pituus){
        this.pituus = pituus;
    }

    public double getPituus(){
        return this.pituus;
    }

    public void setPaino(int paino){
        this.paino = paino;
    }

    public int getPaino(){
        return this.paino;
    }

    public double getPainoindeksi(){
        double painoindeksi = this.paino / (pituus * pituus);
        return painoindeksi;
    }

    @Override
    public String toString(){
        return "Pituus: " + getPituus() + " Paino: " + getPaino() + " Painoindeksi: " + getPainoindeksi();
    }
}
