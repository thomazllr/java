package nelio_alves.Aclasses.OOP_Products.application;

import nelio_alves.Aclasses.OOP_Products.entities.Product;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Type the product name -> ");
        product.name = sc.nextLine();
        System.out.println("Type the product price -> ");
        product.price = sc.nextDouble();
        System.out.println("Type the quantity of the product --> ");
        product.quantity = sc.nextInt();


        System.out.println(product);
        System.out.println("--------------");

        System.out.println("Digite a quantidade que deseja adicionar --> ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println(product);

        System.out.println("Digite a quantidade que deseja remover --> ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println(product);
        System.out.println("--------------");




    }
}
