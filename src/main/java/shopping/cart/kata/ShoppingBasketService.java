package shopping.cart.kata;

public class ShoppingBasketService {
    private BasketReposity basketReposity;

    public ShoppingBasketService(BasketReposity basketReposity) {
        this.basketReposity = basketReposity;
    }

    public void addItem(int userId, int prodId, int quantity) {
        this.basketReposity.getBasketByUserId(userId).addItem(null);
    }
}
