public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product("17LP", "Laptop", "Electronics"),
                new Product("12PH", "Smartphone", "Electronics"),
                new Product("94TA", "Table", "Furniture"),
                new Product("45CH", "Chair", "Furniture")
        };

        // Linear Search
        Product foundProduct = LinearSearch.linearSearch(products, "Laptop");
        System.out.println(foundProduct != null ? foundProduct : "Product not found.");

        // Binary Search
        foundProduct = BinarySearch.binarySearch(products, "Table");
        System.out.println(foundProduct != null ? foundProduct : "Product not found.");
    }
}
