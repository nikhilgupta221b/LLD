package AbstractFactoryPattern;

import AbstractFactoryPattern.Factories.AbstractFactory;
import AbstractFactoryPattern.Factories.VehicleFactory;
import AbstractFactoryPattern.Vehicles.Vehicle;

public class Main {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new AbstractFactory();

        VehicleFactory vehicleFactory = abstractFactory.getVehicleFactory("BMWFactory");

        Vehicle vehicle = vehicleFactory.createVehicle("Car");

        vehicle.drive();
    }
}
