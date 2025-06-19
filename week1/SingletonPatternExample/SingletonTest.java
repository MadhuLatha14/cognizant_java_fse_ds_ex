public class SingletonTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("First message logged.");
        Logger logger2 = Logger.getInstance();
        logger2.log("Second message logged.");
        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 point to the same instance.");
        } else {
            System.out.println("Different instances exist (This should NOT happen).");
        }
    }
}

