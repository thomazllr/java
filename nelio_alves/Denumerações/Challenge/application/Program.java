package nelio_alves.Denumerações.Challenge.application;

import nelio_alves.Denumerações.Challenge.entities.Client;
import nelio_alves.Denumerações.Challenge.entities.Order;
import nelio_alves.Denumerações.Challenge.entities.OrderItem;
import nelio_alves.Denumerações.Challenge.entities.Product;
import nelio_alves.Denumerações.Challenge.entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter cliente data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birthday: ");
        String birthday = sc.nextLine();
        Client client = new Client(name, email, sdf.parse(birthday));

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        String status = sc.nextLine();
        System.out.print("How many itens to this order? ");
        int n = sc.nextInt();
        sc.nextLine();

        Order order = new Order(new Date(), OrderStatus.valueOf(status), client);

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter #%d item data: \n", i + 1);
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();
            sc.nextLine();
            System.out.print("Quantity: ");
            Integer productQuantity = sc.nextInt();
            sc.nextLine();
            OrderItem orderItem = new OrderItem(new Product(productName, productPrice), productQuantity, productPrice);
            order.addItem(orderItem);

        }

        System.out.println("ORDER SUMMARY:\n");
        System.out.println(order);


        sc.close();
    }
}
