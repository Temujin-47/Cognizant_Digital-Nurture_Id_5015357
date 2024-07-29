public class ProxyPatternTest {
    public static void main(String[] args) {
        // Using ProxyImage to load and display images
        Image image1 = new ProxyImage("test_image_1.jpg");
        Image image2 = new ProxyImage("test_image_2.jpg");

        // Display images
        System.out.println("First display call:");
        image1.display(); // Loads and displays the first image

        System.out.println("\nSecond display call:");
        image1.display(); // Only displays the image, does not load it again

        System.out.println("\nThird display call:");
        image2.display(); // Loads and displays the second image

        System.out.println("\nFourth display call:");
        image2.display(); // Only displays the second image, does not load it again
    }
}
