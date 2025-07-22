public class TestProxyPattern {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        // First time loading (will trigger remote load)
        image1.display();
        System.out.println();

        // Second time using same proxy (cached)
        image1.display();
        System.out.println();

        // Another image
        image2.display();
    }
}
