package AbstractFactoryPattern.Products.Bike;

public class ToyotaBike implements Bike {
    @Override
    public void ride() {
        System.out.println("Riding a Toyota Bike");
    }
}
