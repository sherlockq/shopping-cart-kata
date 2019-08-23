package shopping.cart.kata;

public class BasketRepository {
    private BasketCollection basketCollection;

    public BasketRepository(BasketCollection basketCollection) {

        this.basketCollection = basketCollection;
    }

    public Basket getBasketByUserId(int userId) {
        if(basketCollection.hasUserId(userId)) {
            return basketCollection.getByUserId(userId);
        }
        return null;
    }
}
