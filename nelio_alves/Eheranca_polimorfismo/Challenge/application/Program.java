package nelio_alves.Eheranca_polimorfismo.Challenge.application;

import nelio_alves.Eheranca_polimorfismo.Challenge.entities.ImportedProduct;
import nelio_alves.Eheranca_polimorfismo.Challenge.entities.Product;
import nelio_alves.Eheranca_polimorfismo.Challenge.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        List<Product> products = new ArrayList<>();
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.printf("\nProduct #%d data: \n", i + 1);
            System.out.print("Common, used or imported (c/u/i)? ");
            char type = sc.next().charAt(0);
            sc.nextLine();
            System.out.println();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            sc.nextLine();
            if(type == 'i') {
                System.out.print("Customs fee: ");
                Double customFee = sc.nextDouble();
                products.add(new ImportedProduct(name, price, customFee));
                continue;
            }
            else if (type == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String date = sc.next();
                products.add(new UsedProduct(name, price, LocalDate.parse(date, fmt)));
                continue;
            }
            products.add(new Product(name, price));
        }

        System.out.println("PRICE TAGS: ");
        for(Product p : products) {
            System.out.println(p);
        }

        sc.close();
    }
}
