package shopping.cart.kata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Currency;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductShould {
    private static final int PRODUCT_ID = 1;
    private static final String PRODUCT_NAME = "Product1";
    private static final int PRODUCT_PRICE = 3;

    private Product product;

    @BeforeEach
    void setUp() {
        product = new Product(PRODUCT_ID, PRODUCT_NAME, PRODUCT_PRICE);
    }

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
