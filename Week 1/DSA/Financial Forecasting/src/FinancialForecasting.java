public class FinancialForecasting {

    // Iterative method to calculate future value
    public static double calculateFutureValueIterative(double currentValue, double growthRate, int periods) {
        double futureValue = currentValue;
        for (int i = 0; i < periods; i++) {
            futureValue *= (1 + growthRate);
        }
        return futureValue;
    }

    public static void main(String[] args) {
        double initialValue = 1000.0;
        double growthRate = 0.05;
        int periods = 10;

        double futureValueRecursive = calculateFutureValue(initialValue, growthRate, periods);
        double futureValueIterative = calculateFutureValueIterative(initialValue, growthRate, periods);

        System.out.printf("Future Value (Recursive) after %d periods: %.2f%n", periods, futureValueRecursive);
        System.out.printf("Future Value (Iterative) after %d periods: %.2f%n", periods, futureValueIterative);
    }

    // Recursive method
    public static double calculateFutureValue(double currentValue, double growthRate, int periods) {
        if (periods == 0) {
            return currentValue;
        }
        return calculateFutureValue(currentValue * (1 + growthRate), growthRate, periods - 1);
    }
}
