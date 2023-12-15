package nelio_alves.Bencapsulamento.Encapsulamento.application;
import nelio_alves.Bencapsulamento.Encapsulamento.entities.Product;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Type the product name -> ");
        String name = sc.nextLine();
        System.out.println("Type the product price -> ");
        double price = sc.nextDouble();
        sc.nextLine();

        Product product = new Product(name, price);

        System.out.println("--------------");
        System.out.printf("Product name: %s\n\n", product.getName());
        System.out.printf("Product price: %.2f\n\n", product.getPrice());
        System.out.printf("Quantity: %d\n\n", product.getQuantity());
        System.out.println("--------------");


        System.out.println("Type the new product name: ");
        name = sc.nextLine();
        product.setName(name);
        System.out.println("--------------");
        System.out.println("Type the new product price: ");
        price = sc.nextDouble();
        product.setPrice(price);

        System.out.printf("Updated name: %s\n\n", product.getName());
        System.out.printf("Updated price: %.2f\n\n", product.getPrice());
        System.out.printf("Quantity: %d\n\n", product.getQuantity());
        System.out.println(product);
        System.out.println("--------------");

        System.out.println("Type the quantity you want add --> ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println(product);

        System.out.println("Type the quantity you want remove --> ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println(product);
        System.out.println("--------------");

    }
}
