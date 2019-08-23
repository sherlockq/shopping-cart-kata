package shopping.cart.kata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BasketItemShould {
    private static final int QUANTITY = 10;
    private static final int PRODUCT_PRICE = 5;
    private String PRODUCT_NAME = "product name";

    private Product product;
    private BasketItem item;

    @BeforeEach
    void setUp() {
        product = mock(Product.class);
        item = new BasketItem(product, QUANTITY);
    }

    @Test
    void expose_name_of_product() {
        when(product.getName()).thenReturn(PRODUCT_NAME);

        assertEquals(PRODUCT_NAME, item.getProductName());
    }

    @Test
    void expose_price_of_product() {
        when(product.getPrice()).thenReturn(PRODUCT_PRICE);

        assertEquals(PRODUCT_PRICE, item.getUnitPrice());
    }

    @Test
    void expose_quantity_of_product() {

        assertEquals(QUANTITY, item.getQuantity());
    }


    // TODO: total item price
}
