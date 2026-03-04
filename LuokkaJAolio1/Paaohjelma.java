package LuokkaJAolio1;

// Testi ohjelma vahenevaLasku.java luokalle

public class Paaohjelma {
    public static void main(String[] args) {
        VahenevaLaskuri laskuri = new VahenevaLaskuri(10);

        laskuri.tulostaArvo();

        laskuri.vahene();
        laskuri.tulostaArvo();

        laskuri.vahene();
        laskuri.tulostaArvo();
    }
}