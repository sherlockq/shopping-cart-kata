package shopping.cart.kata;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private List<BasketItem> items;

    public Basket() {
        items = new ArrayList<>();
    }

    public void addItem(BasketItem basketItem) {
        items.add(basketItem);
    }

    public List<BasketItem> getItems() {
        return items;
    }
}
