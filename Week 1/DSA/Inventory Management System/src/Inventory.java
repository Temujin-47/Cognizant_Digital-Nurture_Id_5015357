import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Product> productMap;

    public Inventory() {
        this.productMap = new HashMap<>();
    }

    // Add
    public void addProduct(Product product) {
        productMap.put(product.getProductId(), product);
    }

    // Update
    public void updateProduct(String productId, int quantity, double price) {
        Product product = productMap.get(productId);
        if (product != null) {
            product.setQuantity(quantity);
            product.setPrice(price);
        } else {
            System.out.println("Product not found.");
        }
    }

    // Delete
    public void deleteProduct(String productId) {
        if (productMap.remove(productId) == null) {
            System.out.println("Product not found.");
        }
    }

    // get
    public Product getProduct(String productId) {
        return productMap.get(productId);
    }

    // print
    public void displayAllProducts() {
        for (Product product : productMap.values()) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        inventory.addProduct(new Product("1", "X", 10, 23.40));
        inventory.addProduct(new Product("2", "Y", 20, 57));

        inventory.displayAllProducts();

        inventory.updateProduct("1", 30, 24.99);

        inventory.displayAllProducts();

        inventory.deleteProduct("2");

        inventory.displayAllProducts();
    }
}