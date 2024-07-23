package nelio_alves.Iset.application;

import nelio_alves.Iset.entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the file path: ");
        String path = sc.nextLine();


        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            Set<LogEntry> log = new HashSet<>();

            String line = br.readLine();

            while(line != null) {
                String[] tokens = line.split(" ");
                String users = tokens[0];
                Date moment = Date.from(Instant.parse(tokens[1]));
                log.add(new LogEntry(users, moment));
                line = br.readLine();
            }

            System.out.println("Total: " + log.size());


        } catch (IOException e) {
            System.out.println("file not found");
        }
        sc.close();
    }
}
