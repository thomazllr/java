package nelio_alves.Carrays.Exemple2.application;

import nelio_alves.Carrays.Exemple2.entities.Product;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;

        int n = sc.nextInt();
        sc.nextLine();

        Product[] products = new Product[n];

        for (int i = 0; i < products.length; i++) {
            System.out.print("Type the product name ==> ");
            String name = sc.nextLine();
            System.out.print("Type the product price ==> ");
            double price = sc.nextDouble();
            sc.nextLine();
            total += price;
            products[i] = new Product(name, price);
        }

        total /= n;

        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
        System.out.printf("\nAVERAGE PRICE = %.2f", total);
    }
}
