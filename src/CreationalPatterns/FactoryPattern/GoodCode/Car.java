package CreationalPatterns.FactoryPattern.GoodCode;

public class Car implements Vehicle {
    @Override
    public void deliver() {
        System.out.println("Delivered by Car");
    }
}
