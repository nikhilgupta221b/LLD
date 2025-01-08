package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.Products.Bike.Bike;
import AbstractFactoryPattern.Products.Car.Car;

public interface VehicleFactory {
    Car createCar();
    Bike createBike();
}
