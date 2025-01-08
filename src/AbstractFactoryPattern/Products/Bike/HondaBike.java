package AbstractFactoryPattern.Products.Bike;

public class HondaBike implements Bike {
    @Override
    public void ride() {
        System.out.println("Riding a Honda Bike");
    }
}
