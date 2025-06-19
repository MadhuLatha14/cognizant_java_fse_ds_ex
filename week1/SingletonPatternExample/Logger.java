
public class Logger {
    // Step 1: Create a private static instance of Logger
    private static Logger instance;

    // Step 2: Private constructor to prevent instantiation
    private Logger() {
        System.out.println("Logger instance created.");
    }

    // Step 3: Public method to provide access to the instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); // Instantiate if null
        }
        return instance;
    }

    // Example method to show logging
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
