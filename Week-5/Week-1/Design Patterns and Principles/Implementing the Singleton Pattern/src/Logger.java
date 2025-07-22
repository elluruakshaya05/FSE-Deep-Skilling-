public class Logger {

    // Step 1: Private static instance (only one allowed)
    private static Logger instance;

    // Step 2: Private constructor (prevents external instantiation)
    private Logger() {
        System.out.println("Logger Initialized.");
    }

    // Step 3: Public static method to access the single instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); // create if not exists
        }
        return instance;
    }

    // Example logging method
    public void log(String message) {
        System.out.println("[LOG]: " + message);
    }
}
