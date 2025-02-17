package StructuralPatterns.ProxyPattern.GoodCode;

public class Client {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("dog.png");
        Image image2 = new ProxyImage("dog.png"); // Never used so no loading of the image

        image1.display(); // image is loaded only when this is called
        image1.display(); // Uses cached image
    }
}
