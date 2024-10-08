public class SingletonTest {
    public static void main(String[] args) {
        // Attempt to create multiple instances of Logger
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Log messages using the obtained instances
        logger1.log("This is the first log message.");
        logger2.log("This is the second log message.");

        // Verify that both references point to the same instance
        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 reference the same Logger instance.");
        } else {
            System.out.println("logger1 and logger2 reference different Logger instances.");
        }
    }
}
