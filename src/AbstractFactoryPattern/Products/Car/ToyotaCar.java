package AbstractFactoryPattern.Products.Car;

public class ToyotaCar implements Car {
    @Override
    public void drive() {
        System.out.println("Driving a Toyota Car");
    }
}
