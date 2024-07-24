package nelio_alves.Klambda.util;

import nelio_alves.Klambda.entities.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {

    @Override
    public boolean test(Product product) {
        return product.getPrice() > 100;
    }
}
