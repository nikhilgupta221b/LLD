package BehavioralPatterns.StatePattern.GoodCode;

public class Car implements Mode{

    @Override
    public int calcETA() {
        System.out.println("Calculating ETA (Car)");
        return 3;  // Example ETA for car
    }

    @Override
    public String getDirections() {
        return "Directions for driving";
    }
}
