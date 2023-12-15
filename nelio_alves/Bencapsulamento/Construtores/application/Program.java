package nelio_alves.Bencapsulamento.Construtores.application;
import nelio_alves.Bencapsulamento.Construtores.entities.Product;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type the product name -> ");
        String name = sc.nextLine();
        System.out.println("Type the product price -> ");
        double price = sc.nextDouble();
        System.out.println("Type the quantity of the product --> ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);

        System.out.println(product);
        System.out.println("--------------");

        System.out.println("Digite a quantidade que deseja adicionar --> ");
        quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println(product);

        System.out.println("Digite a quantidade que deseja remover --> ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println(product);
        System.out.println("--------------");
    }
}
