public class FinancialForecast {

    // Recursive method to calculate future value
    public static double futureValue(double presentValue, double growthRate, int years) {
        if (years == 0) {
            return presentValue; // Base case
        }
        return futureValue(presentValue, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {
        double presentValue = 10000; // Example: ₹10,000
        double growthRate = 0.08;    // 8% annual growth
        int years = 5;

        double result = futureValue(presentValue, growthRate, years);
        System.out.printf("Future Value after %d years: ₹%.2f\n", years, result);
    }
}
