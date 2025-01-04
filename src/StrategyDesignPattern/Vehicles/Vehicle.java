package StrategyDesignPattern.Vehicles;

import StrategyDesignPattern.Strategy.DriveStrategy;

public abstract class Vehicle {
    DriveStrategy driveStrategy;

    Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }
}
