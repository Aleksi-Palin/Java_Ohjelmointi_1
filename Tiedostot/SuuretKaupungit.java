package Tiedostot;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class SuuretKaupungit {
    public static void main(String[] args) {
        

        try{
            Path tiedostopolku = Paths.get("Tiedostot/kaupungit.csv");
            List<String> rivit = Files.readAllLines(tiedostopolku,StandardCharsets.UTF_8);

            String[] kaupungit = new String[rivit.size()-1];
            int[] vakiluku = new int[rivit.size()-1];

            

            for (int i = 1; i < rivit.size(); i++) {
                String rivi = rivit.get(i);
                kaupungit[i-1] = rivi.split(",")[0];
                vakiluku[i-1] = Integer.parseInt(rivi.split(",")[1]);
            }

            List<String> kaupungitYli = new ArrayList<String>();

            for (int i = 0; i < kaupungit.length; i++) {
                if(vakiluku[i] > 10000){
                    kaupungitYli.add(kaupungit[i]);
                }
            }

            Collections.sort(kaupungitYli);

            for(String kaupunki : kaupungitYli){
                System.out.println(kaupunki);
            }
            

        }catch(IOException e){
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
