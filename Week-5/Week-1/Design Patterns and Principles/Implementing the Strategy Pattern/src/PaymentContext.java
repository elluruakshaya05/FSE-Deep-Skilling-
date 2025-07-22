public class PaymentContext {
    private PaymentStrategy strategy;

    // Set the strategy at runtime
    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    // Execute strategy
    public void executePayment(double amount) {
        if (strategy == null) {
            System.out.println("Payment strategy not set!");
        } else {
            strategy.pay(amount);
        }
    }
}

