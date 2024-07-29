public class SquareAdapter implements PaymentProcessor {
    private SquarePayment square;

    public SquareAdapter(SquarePayment square) {
        this.square = square;
    }

    @Override
    public void processPayment(double amount) {
        square.processTransaction(amount);
    }
}
