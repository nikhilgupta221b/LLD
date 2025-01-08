package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.Products.Bike.Bike;
import AbstractFactoryPattern.Products.Car.Car;
import AbstractFactoryPattern.Products.Bike.ToyotaBike;
import AbstractFactoryPattern.Products.Car.ToyotaCar;

public class ToyotaFactory implements VehicleFactory {
    @Override
    public Car createCar() {
        return new ToyotaCar();
    }

    @Override
    public Bike createBike() {
        return new ToyotaBike();
    }
}
