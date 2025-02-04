package BehavioralPatterns.StatePattern.GoodCode;

public class Walk implements Mode{
    @Override
    public int calcETA() {
        System.out.println("Calculating ETA (Walking)");
        return 10;  // Example ETA for walking
    }

    @Override
    public String getDirections() {
        return "Directions for walking";
    }
}
