package AbstractFactoryPattern.Factories;

import AbstractFactoryPattern.Vehicles.*;

public class HondaFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle(String typeOfVehicle) {
        if (typeOfVehicle.equalsIgnoreCase("Car")) {
            return new HondaCar();
        }
        else if (typeOfVehicle.equalsIgnoreCase("Bike")) {
            return new HondaBike();
        }
        return null;
    }
}
