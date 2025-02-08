package pl.edu.agh.mwo.invoice;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import pl.edu.agh.mwo.invoice.product.Product;

public class Invoice {
    //private Collection<Product> products = new ArrayList<Product>();
    private Map<Product,Integer> products = new HashMap<>();

    public void addProduct(Product product) {
        products.put(product,1);
    }

    public void addProduct(Product product, Integer quantity) {
        products.put(product,quantity);
    }


    public BigDecimal getNetPrice() {
        BigDecimal subtotal = BigDecimal.ZERO;
        for (Product product : products.keySet()) {
            Integer quantity = products.get(product);
            subtotal = subtotal.add(product.getPrice().multiply(new BigDecimal(quantity)));
        }
        return subtotal ;
    }

    public BigDecimal getTax() {
        return getGrossPrice().subtract(getNetPrice());
    }

    public BigDecimal getGrossPrice() {
        BigDecimal subtotal = BigDecimal.ZERO;
        for (Product product : products.keySet()) {
            Integer quantity = products.get(product);
            subtotal = subtotal.add(product.getPriceWithTax().multiply(new BigDecimal(quantity)));
        }
        return subtotal;
    }

}