package nelio_alves.Generics.ex2.application;

import nelio_alves.Generics.ex2.entities.CalculationService;
import nelio_alves.Generics.ex2.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Product> products = new ArrayList<Product>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Nome do produto: ");
            String name = sc.next();
            System.out.println("Nome do preço: ");
            Double price =  sc.nextDouble();
            products.add(new Product(name, price));
        }

        System.out.println(CalculationService.max(products));

    }
}
