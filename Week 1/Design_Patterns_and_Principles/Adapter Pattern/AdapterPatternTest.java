public class AdapterPatternTest {
    public static void main(String[] args) {
        // Using PayPal through adapter
        PaymentProcessor paypalProcessor = new PayPalAdapter(new PayPalPayment());
        paypalProcessor.processPayment(100.0);

        // Using Stripe through adapter
        PaymentProcessor stripeProcessor = new StripeAdapter(new StripePayment());
        stripeProcessor.processPayment(200.0);

        // Using Square through adapter
        PaymentProcessor squareProcessor = new SquareAdapter(new SquarePayment());
        squareProcessor.processPayment(300.0);
    }
}
