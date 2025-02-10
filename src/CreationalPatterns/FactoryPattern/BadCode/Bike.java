package CreationalPatterns.FactoryPattern.BadCode;

public class Bike implements Vehicle {

    @Override
    public void deliver() {
        System.out.println("Deliver by bike.");
    }
}
