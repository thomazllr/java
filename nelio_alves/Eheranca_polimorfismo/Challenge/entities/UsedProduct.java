package nelio_alves.Eheranca_polimorfismo.Challenge.entities;

import java.time.LocalDate;
import java.util.Date;

public class UsedProduct extends Product {
    protected LocalDate manufactureDate;

    public UsedProduct() {
        super();
    }

    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        return name + " (used) $ " + price + " (Manufactured date: "  + manufactureDate + ")";
    }

    @Override
    public String toString() {
        return priceTag();
    }
}
