package AbstractFactoryPattern;

import AbstractFactoryPattern.Factory.HondaFactory;
import AbstractFactoryPattern.Factory.ToyotaFactory;
import AbstractFactoryPattern.Factory.VehicleFactory;
import AbstractFactoryPattern.Products.Bike.Bike;
import AbstractFactoryPattern.Products.Car.Car;

public class Main {
    public static void main(String[] args) {
        // Use Toyota Factory
        VehicleFactory toyotaFactory = new ToyotaFactory();
        Car toyotaCar = toyotaFactory.createCar();
        Bike toyotaBike = toyotaFactory.createBike();
        toyotaCar.drive();
        toyotaBike.ride();

        // Use Honda Factory
        VehicleFactory hondaFactory = new HondaFactory();
        Car hondaCar = hondaFactory.createCar();
        Bike hondaBike = hondaFactory.createBike();
        hondaCar.drive();
        hondaBike.ride();
    }
}
