package nelio_alves.Denumerações.Challenge.entities;

import nelio_alves.Denumerações.Challenge.entities.enums.OrderStatus;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private Date moment;
    private OrderStatus status;
    private Client client;

    List<OrderItem> items = new ArrayList<>();

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }


    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public double total() {
        double sum = 0;
        for (OrderItem item : items) {
            sum += item.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: " + moment + "\n");
        sb.append("Order Status: " + status + "\n");
        sb.append("Client: " + client.getName() + "(" + client.getBirthDate().format(fmt) + ") - " + client.getEmail() + "\n");
        sb.append("Order Items: \n");
        for (OrderItem item : items) {
            sb.append(item.getProduct().getName() + ", Quantity: " + item.getQuantity() + ", Subtotal: " + item.subTotal() + "\n");
        }
        sb.append("Total price: $" + String.format("%.2f", total()));
        return sb.toString();
    }
}
