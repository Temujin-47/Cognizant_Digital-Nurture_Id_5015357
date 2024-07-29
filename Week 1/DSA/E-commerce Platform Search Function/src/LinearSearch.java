public class LinearSearch {
    public static Product linearSearch(Product[] products, String searchTerm) {
        for (Product product : products) {
            if (product.getProductName().equalsIgnoreCase(searchTerm) ||
                    product.getCategory().equalsIgnoreCase(searchTerm) ||
                    product.getProductId().equals(searchTerm)) {
                return product;
            }
        }
        return null; // Return null if product not found
    }
}
