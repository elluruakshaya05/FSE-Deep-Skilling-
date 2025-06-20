public class Main {
    public static void main(String[] args) {
        Order[] orders = new Order[] {
                new Order(101, "Alice", 250.00),
                new Order(102, "Bob", 120.50),
                new Order(103, "Charlie", 540.75),
                new Order(104, "David", 330.10)
        };

        OrderSorter sorter = new OrderSorter();

        // Test Bubble Sort
        System.out.println("=== Bubble Sort ===");
        Order[] bubbleSorted = orders.clone();
        sorter.bubbleSort(bubbleSorted);
        sorter.displayOrders(bubbleSorted);

        // Test Quick Sort
        System.out.println("\n=== Quick Sort ===");
        Order[] quickSorted = orders.clone();
        sorter.quickSort(quickSorted, 0, quickSorted.length - 1);
        sorter.displayOrders(quickSorted);
    }
}
