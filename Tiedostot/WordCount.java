package Tiedostot;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Anna tiedoston nimi: ");
        String tiedostonimi = s.nextLine();

        s.close();
        
        
        

        try{
            Path tiedostpolku = Paths.get("Tiedostot/" + tiedostonimi);
            List<String> rivit = Files.readAllLines(tiedostpolku,StandardCharsets.UTF_8);

            int sanamaara = 0;
            int merkkimaara = 0;

            for (String rivi : rivit) {
                String trimattu = rivi.trim();
                if (!trimattu.isEmpty()) {
                    sanamaara += trimattu.split("\\s+").length;
                }
                merkkimaara += rivi.length();
            }

            System.out.print(String.format("Tiedostossa on:\n %d riviä\n %d sanaa\n %d merkkiä",rivit.size(), sanamaara, merkkimaara));



        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        
    }
}
