package StructuralPatterns.FlyWeightPattern.BadCode;

public class Client {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Bullet bullet = new Bullet(i * 10, i * 12, 5, "red");
            bullet.display();
        }
        // problems: Color is a repeated property consuming memory
    }
}
