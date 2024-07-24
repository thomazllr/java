package nelio_alves.Jmap.challenge.functional;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

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

                candidatos.merge(candidato, Integer.parseInt(voto), Integer::sum);

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
