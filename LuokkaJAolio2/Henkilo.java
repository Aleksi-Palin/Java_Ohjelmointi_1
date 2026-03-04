package LuokkaJAolio2;

public class Henkilo{
    private String nimi;
    private String osoite;


    public Henkilo(String nimi, String osoite){
        this.nimi = nimi;
        this.osoite = osoite;
    }

    public Henkilo (){
        this.nimi = "";
        this.osoite = "";
    }

    public void setNimi(String nimi){
        this.nimi = nimi;
    }

    public String getNimi(){
        return this.nimi;
    }

    public void setOsoite(String osoite){
        this.osoite = osoite;
    }

    public String getOsoite(){
        return this.osoite;
    }

    @Override
    public String toString(){
        return ("Nimi: " + getNimi() + "\nOsoite: " + getOsoite());
    }
}