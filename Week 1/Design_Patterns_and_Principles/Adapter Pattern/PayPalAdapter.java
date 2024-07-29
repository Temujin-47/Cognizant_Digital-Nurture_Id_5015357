public class PayPalAdapter implements PaymentProcessor {
    private PayPalPayment payPal;

    public PayPalAdapter(PayPalPayment payPal) {
        this.payPal = payPal;
    }

    @Override
    public void processPayment(double amount) {
        payPal.sendPayment(amount);
    }
}
