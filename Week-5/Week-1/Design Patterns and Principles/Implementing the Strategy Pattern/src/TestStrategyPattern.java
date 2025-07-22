public class TestStrategyPattern {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Use Credit Card
        PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9012", "Alice");
        context.setPaymentStrategy(creditCard);
        context.executePayment(250.00);

        System.out.println();

        // Use PayPal
        PaymentStrategy payPal = new PayPalPayment("alice@example.com");
        context.setPaymentStrategy(payPal);
        context.executePayment(99.99);
    }
}

