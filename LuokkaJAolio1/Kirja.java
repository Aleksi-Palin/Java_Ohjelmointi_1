package LuokkaJAolio1;

public class Kirja {

    private String nimi;
    private String isbn;
    private double hinta;
    private int julkaisuvuosi;

    // Constructor can be empty or it can have parameters.


    public Kirja(String nimi, String isbn, double hinta, int julkaisuvuosi){
        this.nimi = nimi;
        this.isbn = isbn;
        this.hinta = hinta;
        this.julkaisuvuosi = julkaisuvuosi;
    }

    public Kirja(Kirja other){
        this.nimi = other.nimi;
        this.isbn = other.isbn;
        this.hinta = other.hinta;
        this.julkaisuvuosi = other.julkaisuvuosi;
    }

    // Get Set methods
    public String getNimi() {
        return this.nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }   

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getHinta() {
        return this.hinta;
    }

    public void setHinta(double hinta) {
        this.hinta = hinta;
    }

    public int getJulkaisuvuosi() {
        return this.julkaisuvuosi;
    }

    public void setJulkaisuvuosi(int julkaisuvuosi) {
        this.julkaisuvuosi = julkaisuvuosi;
    }

    @Override
    public String toString() {
        
        return "\nKirja [nimi=" + this.nimi + ", isbn=" + this.isbn + ", hinta=" + this.hinta + ", vuosi=" + this.julkaisuvuosi + "]\n";
    }


}
