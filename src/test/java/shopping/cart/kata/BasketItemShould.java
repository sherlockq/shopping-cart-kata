package shopping.cart.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BasketItemShould {
    private static final int QUANTITY = 10;
    private static final int PRODUCT_PRICE = 5;
    private String PRODUCT_NAME = "product name";

    @Test
    void expose_name_of_product() {
        Product product = mock(Product.class);
        when(product.getName()).thenReturn(PRODUCT_NAME);
        BasketItem item = new BasketItem(product, QUANTITY);

        assertEquals(PRODUCT_NAME, item.getProductName());
    }

    // unit price
    @Test
    void expose_price_of_product() {
        Product product = mock(Product.class);
        when(product.getPrice()).thenReturn(PRODUCT_PRICE);
        BasketItem item = new BasketItem(product, QUANTITY);

        assertEquals(PRODUCT_PRICE, item.getUnitPrice());
    }

    // quantity

    // total item price
}
