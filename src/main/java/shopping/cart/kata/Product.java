package shopping.cart.kata;

public class Product {
    private final int productId;
    private final String productName;
    private final int productPrice;

    public Product(int productId, String productName, int productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public int getId() {
        return productId;
    }

    public String getName() {
        return productName;
    }

    public int getPrice() {
        return productPrice;
    }
}
