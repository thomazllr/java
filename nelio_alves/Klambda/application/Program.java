package nelio_alves.Klambda.application;
import nelio_alves.Klambda.entities.Product;
import nelio_alves.Klambda.util.PriceUpdate;
import nelio_alves.Klambda.util.ProductPredicate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Program {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<Product>();

        products.add(new Product("Tv", 4500.0));
        products.add(new Product("Smartphone", 6000.0));
        products.add(new Product("Mouse", 50.0));
        products.add(new Product("Fone", 500.0));
        products.add(new Product("HD case", 20.0));

        products.removeIf(p -> p.getPrice() < 100);

        products.sort(Comparator.comparing(p -> p.getName().toUpperCase()));

        products.forEach(p -> p.setPrice(p.getPrice() * 1.1));

        products.forEach(System.out::println);




    }
}
