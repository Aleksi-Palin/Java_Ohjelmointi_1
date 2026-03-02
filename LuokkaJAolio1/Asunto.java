package LuokkaJAolio1;

public class Asunto{

    private String tyyppi;
    private String osoite;
    private double pinta_ala;
    private double hinta;
    private String kuvaus;

    public Asunto(String tyyppi, String osoite, double pinta_ala, double hinta, String kuvaus){
        this.tyyppi = tyyppi;
        this.osoite = osoite;
        this.pinta_ala = pinta_ala;
        this.hinta = hinta;
        this.kuvaus = kuvaus;
    }

    public Asunto(Asunto other){
        this.tyyppi = other.tyyppi;
        this.osoite = other.osoite;
        this.pinta_ala = other.pinta_ala;
        this.hinta = other.hinta;
        this.kuvaus = other.kuvaus;
    }

    public void setTyyppi(String tyyppi){
        this.tyyppi = tyyppi;

    }

    public String getTyyppi(){
        return this.tyyppi;
    }

    public void setOsoite(String osoite){
        this.osoite = osoite;
    }

    public String getOsoite(){
        return this.osoite;
    }

    public void setPinta_ala(double pinta_ala){
        this.pinta_ala = pinta_ala;
    }

    public double getPinta_ala(){
        return this.pinta_ala;
    }

    public void setHinta(double hinta){
        this.hinta = hinta;
    }

    public double getHinta(){
        return this.hinta;
    }

    public void setKuvaus(String kuvaus){
        this.kuvaus = kuvaus;
    }

    public String getkuvaus(){
        return this.kuvaus;
    }

    @Override
    public String toString(){
    return String.format("\nTyyppi: %s\nOsoite: %s\nPinta-ala: %.2f\nHinta: %.2f euroa\nKuvaus: %s", getTyyppi(),getOsoite(),getPinta_ala() ,getHinta(),getkuvaus());
    }

}