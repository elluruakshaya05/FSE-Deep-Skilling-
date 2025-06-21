public class MobileApp implements Observer {
    private String appId;

    public MobileApp(String appId) {
        this.appId = appId;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println("MobileApp [" + appId + "] - " + stockName + " is now $" + price);
    }
}

