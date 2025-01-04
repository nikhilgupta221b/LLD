package StrategyDesignPattern;

import StrategyDesignPattern.Vehicles.PassangerVehicle;
import StrategyDesignPattern.Vehicles.SportsVehicle;

public class Main {
    public static void main(String[] args) {
        // Creating new passanger vehicle
        PassangerVehicle passangerVehicle = new PassangerVehicle();
        passangerVehicle.drive();

        // Creating new sports vehicle
        SportsVehicle sportsVehicle = new SportsVehicle();
        sportsVehicle.drive();
    }
}
