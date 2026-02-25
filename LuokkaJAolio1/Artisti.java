package LuokkaJAolio1;

public class Artisti {

   private String nimi;
   private int syntymavuosi;

   public Artisti(String nimi, int syntymavuosi) {
      this.nimi = nimi;
      this.syntymavuosi = syntymavuosi;
   }
   public String getNimi() {
      // Kirjoita tämän metodin toteutus
      return this.nimi;
   }
   public void setNimi(String nimi) {
      // Kirjoita tämän metodin toteutus
      this.nimi = nimi;
   }
   public int getSyntymavuosi() {
      // Kirjoita tämän metodin toteutus
      return this.syntymavuosi;
   }
   public void setSyntymavuosi(int syntymavuosi) {
     // Kirjoita tämän metodin toteutus
     this.syntymavuosi = syntymavuosi;
   }
   @Override
   public String toString() {
      return this.nimi;
   }
}