package LuokkaJAolio1;

public class Kappale {
    
    private String nimi;
    private Artisti artisti;
    private int vuosi;
    private int kesto;


   
    public void setNimi(String nimi){
        this.nimi = nimi;
    }
    
    public Artisti getArtisti(){
        return this.artisti;
    }

    public void setArtisti(Artisti artisti){
        this.artisti = artisti;
    }

    public int getVuosi(){
        return this.vuosi;
    }

    public void setVuosi(int vuosi){
        this.vuosi = vuosi;
    }

    public int getKesto(){
        return this.kesto;
    }

    public void setKesto(int kesto){
        this.kesto = kesto;
    }

    @Override
    public String toString(){
        return this.nimi;
    }
}
