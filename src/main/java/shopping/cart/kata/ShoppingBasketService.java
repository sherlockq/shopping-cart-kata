package shopping.cart.kata;

public class ShoppingBasketService {
    private BasketRepository basketRepository;

    public ShoppingBasketService(BasketRepository basketRepository) {
        this.basketRepository = basketRepository;
    }

    public void addItem(int userId, int prodId, int quantity) {
        this.basketRepository.getBasketByUserId(userId).addItem(null);
    }
}
