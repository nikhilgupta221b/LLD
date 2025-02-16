package StructuralPatterns.ProxyPattern.BadCode;

public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadImage();
    }

    public void loadImage() {
        System.out.println("Loading image: " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + fileName);
    }
}
