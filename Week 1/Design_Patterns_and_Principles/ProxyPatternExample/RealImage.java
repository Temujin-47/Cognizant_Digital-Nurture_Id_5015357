public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadImageFromServer();
    }

    private void loadImageFromServer() {
        System.out.println("Loading image " + fileName + " from server...");
        // Simulate time taken to load image
        try {
            Thread.sleep(2000); // simulate delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Image " + fileName + " loaded.");
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }
}
