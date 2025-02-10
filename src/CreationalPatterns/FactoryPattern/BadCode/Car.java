package CreationalPatterns.FactoryPattern.BadCode;

public class Car implements Vehicle {
    @Override
    public void deliver() {
        System.out.println("Delivery by car.");
    }
}
