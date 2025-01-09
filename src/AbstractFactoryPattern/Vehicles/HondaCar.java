package AbstractFactoryPattern.Vehicles;

public class HondaCar implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Driving Honda Car");
    }
}
