package pl.edu.agh.mwo.invoice.product;

import java.math.BigDecimal;
import java.util.Objects ;

public class TaxFreeProduct extends Product {
    public TaxFreeProduct(String name, BigDecimal price) {
        super(name, price, BigDecimal.ZERO);
        if(Objects.equals(name, "")){
            throw new IllegalArgumentException("Name cannot be empty");

        }
        if(price ==null||price.compareTo(BigDecimal.ZERO) < 0){
            throw new IllegalArgumentException("Price cannot be negative");
        }
    }
}
