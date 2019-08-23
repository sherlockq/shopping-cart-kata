package shopping.cart.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class BasketRepositoryShould {

    private static final int USER_ID = 1;

    @Test
    void return_existing_basket_by_user_id() {

        BasketCollection basketCollection = mock(BasketCollection.class);
        when(basketCollection.hasUserId(USER_ID)).thenReturn(true);
        Basket basket = mock(Basket.class);
        when(basketCollection.getByUserId(USER_ID)).thenReturn(basket);
        BasketRepository basketRepository = new BasketRepository(basketCollection);

        assertEquals(basket, basketRepository.getBasketByUserId(USER_ID));
    }

    @Test
    void check_user_id_in_basket_collection_before_get_basket() {

        BasketCollection basketCollection = mock(BasketCollection.class);
        BasketRepository basketRepository = new BasketRepository(basketCollection);

        basketRepository.getBasketByUserId(USER_ID);

        verify(basketCollection).hasUserId(USER_ID);
    }

    @Test
    void return_new_basket_if_not_in_collection_yet() {
//
//        BasketCollection basketCollection = mock(BasketCollection.class);
//        BasketRepository basketRepository = new BasketRepository(basketCollection);
//
//        basketRepository.getBasketByUserId(USER_ID);
//
//        verify(basketCollection).add(USER_ID, basket);
    }
}