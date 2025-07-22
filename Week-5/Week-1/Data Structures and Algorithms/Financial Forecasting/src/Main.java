import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FinancialForecaster forecaster = new FinancialForecaster();

        System.out.print("Enter Present Value: ");
        double presentValue = scanner.nextDouble();

        System.out.print("Enter Annual Growth Rate (e.g., 0.05 for 5%): ");
        double growthRate = scanner.nextDouble();

        System.out.print("Enter Number of Years: ");
        int years = scanner.nextInt();

        double future = forecaster.predictFutureValue(presentValue, growthRate, years);
        System.out.printf("Predicted Future Value (Recursive): %.2f%n", future);

        // With memoization (optimized)
        double[] memo = new double[years + 1];
        double optimizedFuture = forecaster.predictWithMemo(presentValue, growthRate, years, memo);
        System.out.printf("Predicted Future Value (Memoized): %.2f%n", optimizedFuture);
    }
}
