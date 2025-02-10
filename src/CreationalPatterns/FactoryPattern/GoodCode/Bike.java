package CreationalPatterns.FactoryPattern.GoodCode;

public class Bike implements Vehicle {

    @Override
    public void deliver() {
        System.out.println("Delivered by Bike");
    }
}
