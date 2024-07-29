public class Logger {
    // Private static instance of Logger
    private static Logger instance;

    // Private constructor to prevent instantiation
    private Logger() {
    }

    // Public access to the instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // log messages
    public void log(String message) {
        System.out.println("Log message: " + message);
    }
}
