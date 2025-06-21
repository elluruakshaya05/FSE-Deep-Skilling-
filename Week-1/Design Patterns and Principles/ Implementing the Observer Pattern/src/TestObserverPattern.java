public class TestObserverPattern {
    public static void main(String[] args) {
        // Subject
        StockMarket stockMarket = new StockMarket();

        // Observers
        Observer mobile1 = new MobileApp("Mobile-101");
        Observer mobile2 = new MobileApp("Mobile-102");
        Observer web1 = new WebApp("Alice");

        // Register observers
        stockMarket.registerObserver(mobile1);
        stockMarket.registerObserver(mobile2);
        stockMarket.registerObserver(web1);

        // Change stock prices
        stockMarket.setStockPrice("AAPL", 191.23);
        System.out.println();

        stockMarket.setStockPrice("GOOGL", 2840.55);
        System.out.println();

        // Remove one observer
        stockMarket.removeObserver(mobile2);
        stockMarket.setStockPrice("TSLA", 682.99);
    }
}
