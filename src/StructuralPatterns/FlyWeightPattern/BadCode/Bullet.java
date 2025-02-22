package StructuralPatterns.FlyWeightPattern.BadCode;

public class Bullet {
    private final int x;
    private final int y;
    private final int speed;
    private final String color;

    public Bullet(int x, int y, int speed, String color) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.color = color;
    }

    public void display() {
        System.out.println("Bullet: " + x + ", " + y + ", " + speed + ", " + color);
    }
}
