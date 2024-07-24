package nelio_alves.Klambda.streams.exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            Map<String, Double> products = new LinkedHashMap<>();
            String line = br.readLine();

            while (line != null) {
                String[] tokens = line.split(",");
                String product = tokens[0];
                String price = tokens[1];

                products.put(product, Double.parseDouble(price));
                line = br.readLine();
            }

            Double average = products.values().stream().mapToDouble(Double::doubleValue).average().orElse(0.0);

            Stream<String> productsAverage = products.entrySet().
                    stream().
                    filter(entry -> entry.getValue() < average).
                    sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).
                    map(Map.Entry::getKey);

            System.out.println(average);
            productsAverage.forEach(System.out::println);


//            for (String key : products.keySet()) {
//                System.out.println(key + ", " + products.get(key));
//            }




        } catch (IOException e) {
            System.out.println("file not found");
        }
        sc.close();
    }

}
