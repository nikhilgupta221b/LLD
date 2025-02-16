package StructuralPatterns.ProxyPattern.BadCode;

public class Client {
    public static void main(String[] args) {
        Image image1 = new RealImage("dog.png");
        Image image2 = new RealImage("dog.png");
        // Problem 1 : Image is loaded as soon as object is created.
        // Problem 2 : 2 Instance of same Image

        image1.display(); // Should be loaded when used here
        image1.display(); // Should be cached so that not loaded again.
    }
}
