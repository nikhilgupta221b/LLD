package StructuralPatterns.FlyWeightPattern.GoodCode;

public class Bullet {
    private final int x;
    private final int y;
    private final int speed;
    private final BulletType bulletType;

    public Bullet(int x, int y, int speed, String color) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.bulletType = BulletTypeFactory.getBulletType(color);
    }

    public void display() {
        System.out.println("Bullet: " + x + ", " + y + ", " + speed + ", " + bulletType.getColor());
    }
}
