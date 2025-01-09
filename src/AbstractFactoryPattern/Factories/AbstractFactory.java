package AbstractFactoryPattern.Factories;

public class AbstractFactory {
    public VehicleFactory getVehicleFactory(String factoryType) {
        if (factoryType.equalsIgnoreCase("BMWFactory")) {
            return new BMWFactory();
        }
        if (factoryType.equalsIgnoreCase("HondaFactory")) {
            return new HondaFactory();
        }
        return null;
    }
}
