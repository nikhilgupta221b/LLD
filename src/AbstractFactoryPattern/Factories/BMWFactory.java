package AbstractFactoryPattern.Factories;

import AbstractFactoryPattern.Vehicles.BMWBike;
import AbstractFactoryPattern.Vehicles.BMWCar;
import AbstractFactoryPattern.Vehicles.Vehicle;

public class BMWFactory implements VehicleFactory{

    @Override
    public Vehicle createVehicle(String typeOfVehicle) {
        if (typeOfVehicle.equalsIgnoreCase("Car")) {
            return new BMWCar();
        }
        else if (typeOfVehicle.equalsIgnoreCase("Bike")) {
            return new BMWBike();
        }
        return null;
    }
}
