package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.Products.Bike.Bike;
import AbstractFactoryPattern.Products.Car.Car;
import AbstractFactoryPattern.Products.Bike.HondaBike;
import AbstractFactoryPattern.Products.Car.HondaCar;

public class HondaFactory implements VehicleFactory {
    @Override
    public Car createCar() {
        return new HondaCar();
    }

    @Override
    public Bike createBike() {
        return new HondaBike();
    }
}