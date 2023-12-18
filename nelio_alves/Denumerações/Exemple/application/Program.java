package nelio_alves.Denumerações.Exemple.application;

import nelio_alves.Denumerações.Exemple.entities.Order;
import nelio_alves.Denumerações.Exemple.entities.enums.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Order order = new Order(777, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

    }
}
