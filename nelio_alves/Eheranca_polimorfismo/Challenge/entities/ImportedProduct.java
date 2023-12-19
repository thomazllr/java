package nelio_alves.Eheranca_polimorfismo.Challenge.entities;

public class ImportedProduct extends Product {

    protected Double customsFee;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public double totalPrice() {
        return price + customsFee;
    }

    @Override
    public String priceTag() {
        return name + " $ " + totalPrice() + " (Customs fee: $ " + customsFee + ")";
    }

    @Override
    public String toString() {
        return priceTag();
    }
}
