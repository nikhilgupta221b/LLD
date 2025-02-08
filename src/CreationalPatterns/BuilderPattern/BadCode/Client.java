package CreationalPatterns.BuilderPattern.BadCode;

public class Client {
    public static void main(String[] args) {
        // Problems without builder pattern -
        // Constructor Explosion
        // Difficult to understand constructors
        House house = new House("duplex", "white", "200", false);
        System.out.println(house);
    }
}
