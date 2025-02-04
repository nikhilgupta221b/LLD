package BehavioralPatterns.StatePattern.GoodCode;

public class Cycle implements Mode{
    @Override
    public int calcETA() {
        System.out.println("Calculating ETA (Cycling)");
        return 5;  // Example ETA for cycling
    }

    @Override
    public String getDirections() {
        return "Directions for cycling";
    }
}
