package nelio_alves.Jmap.challenge.application;

import nelio_alves.Iset.entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.*;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            Map<String, Integer> candidatos = new LinkedHashMap<>();
            String line = br.readLine();

            while (line != null) {
                String[] tokens = line.split(",");
                String candidato = tokens[0];
                String voto = tokens[1];
                if(candidatos.containsKey(candidato)) {
                    Integer votos = candidatos.get(tokens[0]) + Integer.parseInt(voto);
                    candidatos.put(candidato, votos);
                }
                else {
                    candidatos.put(candidato, Integer.parseInt(voto));
                }

                line = br.readLine();
            }

            for (String key : candidatos.keySet()) {
                System.out.println(key + ", " + candidatos.get(key));
            }



        } catch (IOException e) {
            System.out.println("file not found");
        }
        sc.close();
    }

}
