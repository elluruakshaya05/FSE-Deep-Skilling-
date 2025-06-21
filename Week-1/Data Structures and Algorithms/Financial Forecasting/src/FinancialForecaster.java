public class FinancialForecaster {

    // Recursive method to calculate future value
    public double predictFutureValue(double presentValue, double growthRate, int years) {
        if (years == 0) {
            return presentValue;
        }
        return predictFutureValue(presentValue, growthRate, years - 1) * (1 + growthRate);
    }

    // Optimized recursive version using memoization
    public double predictWithMemo(double presentValue, double growthRate, int years, double[] memo) {
        if (years == 0) return presentValue;
        if (memo[years] != 0) return memo[years];

        memo[years] = predictWithMemo(presentValue, growthRate, years - 1, memo) * (1 + growthRate);
        return memo[years];
    }
}
