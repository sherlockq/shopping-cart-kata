package shopping.cart.kata;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class BasketShould {


    @Test
    void name() {
        Basket basket = new Basket();
        BasketItem item = mock(BasketItem.class);
        basket.addItem(item);

        assertEquals(1, basket.getItems().size());
    }
}
