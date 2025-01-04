package StrategyDesignPattern.Vehicles;

import StrategyDesignPattern.Strategy.NormalDriveStrategy;

public class PassangerVehicle extends Vehicle {
    public PassangerVehicle() {
        super(new NormalDriveStrategy());
    }
}
