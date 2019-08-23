package shopping.cart.kata;

import org.junit.jupiter.api.Test;

import java.util.Currency;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductShould {
    Product product = new Product(1, "Product1", 3);

    @Test
    void return_id_by_getters() {
        assertEquals(1,product.getId());
    }

    @Test
    void return_name_by_getters() {
        assertEquals("Product1",product.getName());
    }

    @Test
    void return_price_by_getters() {
        assertEquals(3,product.getPrice());
    }
}
