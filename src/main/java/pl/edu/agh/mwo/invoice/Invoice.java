package pl.edu.agh.mwo.invoice;

import java.math.BigDecimal;
import java.util.Collection;

import pl.edu.agh.mwo.invoice.product.Product;

public class Invoice {
    private Collection<Product> products;

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addProduct(Product product, Integer quantity) {
        for (int i = 0; i < quantity; i++) {
            products.add(product);
        }
    }

    public BigDecimal getSubtotal() {
        return BigDecimal.ZERO;
    }

    public BigDecimal getTax() {
        return BigDecimal.ZERO;
    }

    public BigDecimal getTotal() {
        return BigDecimal.ZERO;
    }
}
