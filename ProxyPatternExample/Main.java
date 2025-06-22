package ProxyPatternExample;

public class Main {
    public static void main(String[] args) {
        Image img1 = new ProxyImage("cat.jpg");
        Image img2 = new ProxyImage("dog.jpg");

        // First time - will load from server
        img1.display();

        // Second time - will use cached
        img1.display();

        // First time for dog.jpg - loads from server
        img2.display();
    }
}