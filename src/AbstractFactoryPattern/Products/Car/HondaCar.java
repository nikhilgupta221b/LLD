package AbstractFactoryPattern.Products.Car;

public class HondaCar implements Car {
    @Override
    public void drive() {
        System.out.println("Driving a Honda Car");
    }
}
