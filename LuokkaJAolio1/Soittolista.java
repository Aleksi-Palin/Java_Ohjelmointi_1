package LuokkaJAolio1;

import java.util.ArrayList;

public class Soittolista {

    private ArrayList<Kappale> kappaleet;

    public Soittolista(){
        this.kappaleet = new ArrayList<Kappale>();
    }

    public void lisaaKappale(Kappale kappale){
        this.kappaleet.add(kappale);
    }

    public Kappale getKappale(int indeksi){

        if(indeksi > kappaleet.size()){
            return null;
        }else{
            return kappaleet.get(indeksi);
        }
        
    }

    public int haeKokonaispituus(){
        int kokonaiskesto = 0;
        for (int i = 0; i < kappaleet.size(); i++) {
            kokonaiskesto += kappaleet.get(i).getKesto();
        }

        return kokonaiskesto;
    }

    @Override
    public String toString(){
        String palautus = "";

        for (int i = 0; i < kappaleet.size(); i++) {
            palautus += String.format("%s: %s\n", (i+1), kappaleet.get(i));
        }

        return palautus;
    }

    public static void main(String[] args) {
        Soittolista soittolista = new Soittolista();

        Artisti artisti = new Artisti("Rick Astley", 1966);

        Kappale kappale = new Kappale();
        kappale.setNimi("Never Gonna Give You Up");
        kappale.setVuosi(1987);
        kappale.setKesto(215);
        kappale.setArtisti(artisti);

        soittolista.lisaaKappale(kappale);

        System.out.println(soittolista);
        System.out.println(soittolista.haeKokonaispituus());

        Artisti artisti2 = new Artisti("David Hasselhoff", 1952);

        Kappale kappale2 = new Kappale();
        kappale2.setNimi("Hooked on a Feeling");
        kappale2.setVuosi(1997);
        kappale2.setKesto(211);
        kappale.setArtisti(artisti2);

        soittolista.lisaaKappale(kappale2);

        System.out.println(soittolista);
        System.out.println(soittolista.haeKokonaispituus());
    }
}
