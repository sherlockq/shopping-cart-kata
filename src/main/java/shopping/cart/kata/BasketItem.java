package shopping.cart.kata;

public class BasketItem {
    private final Product product;
    private final int quantity;

    public BasketItem(Product product, int quantity) {

        this.product = product;
        this.quantity = quantity;
    }

    public String getProductName() {
        return product.getName();
    }

    public int getUnitPrice() {
        return product.getPrice();
    }

    public int getQuantity() {
        return quantity;
    }
}
