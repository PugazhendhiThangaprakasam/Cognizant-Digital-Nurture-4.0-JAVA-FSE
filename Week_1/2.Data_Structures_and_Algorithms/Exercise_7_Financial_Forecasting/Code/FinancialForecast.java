
public class FinancialForecast {

    public static double futureValue(double initialAmount, double rate, int years) {
        if (years == 0) {
            return initialAmount;
        }
        return (1 + rate) * futureValue(initialAmount, rate, years - 1);
    }

    public static double futureValueIterative(double initialAmount, double rate, int years) {
        double result = initialAmount;
        for (int i = 0; i < years; i++) {
            result *= (1 + rate);
    }
    return result;
}

    public static void main(String[] args) {
        double initial = 10000;
        double rate = 0.05;
        int years = 5;

        double predictedValue = futureValue(initial, rate, years);
        double predictedValueByIterative = futureValueIterative(initial, rate, years);
        System.out.printf("Future value after %d years = %.2f\n", years, predictedValue);

        System.out.printf("Future value after %d years = %.2f\n", years, predictedValueByIterative);

        System.out.println("Recursive Approach is Preferred for larger input sizes rather than iterative approach\n");
    }
}
