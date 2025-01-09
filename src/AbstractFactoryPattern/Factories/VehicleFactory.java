package AbstractFactoryPattern.Factories;

import AbstractFactoryPattern.Vehicles.Vehicle;

public interface VehicleFactory {
    Vehicle createVehicle(String typeOfVehicle);
}
