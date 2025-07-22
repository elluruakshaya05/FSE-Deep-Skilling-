public class TestAdapterPattern {
    public static void main(String[] args) {
        // Using PayPal
        PayPalGateway payPal = new PayPalGateway();
        PaymentProcessor paypalProcessor = new PayPalAdapter(payPal);
        paypalProcessor.processPayment(150.75);

        // Using Stripe
        StripeGateway stripe = new StripeGateway();
        PaymentProcessor stripeProcessor = new StripeAdapter(stripe);
        stripeProcessor.processPayment(250.00);
    }
}
