public class TestLogger {
    public static void main(String[] args) {

        // Try to get logger instance multiple times
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Log some messages
        logger1.log("This is the first log message.");
        logger2.log("This is the second log message.");

        // Test if both logger instances are the same
        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same (Singleton confirmed).");
        } else {
            System.out.println("Different logger instances (Singleton failed).");
        }
    }
}

