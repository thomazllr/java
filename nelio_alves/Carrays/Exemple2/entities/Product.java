package nelio_alves.Carrays.Exemple2.entities;

public class Product {

    private String name;
    private double price;


    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "\nProduct: " +
                "Name = " + name  +
                ", Price = $ " + String.format("%.2f", price);
    }
}

