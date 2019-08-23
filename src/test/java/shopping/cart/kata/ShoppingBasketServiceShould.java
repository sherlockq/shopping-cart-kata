package shopping.cart.kata;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class ShoppingBasketServiceShould {
    private static final int USER_ID = 1;
    private static final int PROD_ID = 2;

    @Test
    void find_a_basket_by_userId_and_add_an_item_to_it() {
        Basket basket = mock(Basket.class);
        BasketReposity basketReposity = mock(BasketReposity.class);
        ShoppingBasketService basketService = new ShoppingBasketService(basketReposity);
        when(basketReposity.getBasketByUserId(USER_ID)).thenReturn(basket);

        basketService.addItem(USER_ID, PROD_ID, 3);

        verify(basket).addItem(any());
    }


}
