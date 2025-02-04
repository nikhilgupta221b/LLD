package BehavioralPatterns.StatePattern.GoodCode;

public class Train implements Mode{
    @Override
    public int calcETA() {
        System.out.println("Calculating ETA (Train)");
        return 7;  // Example ETA for train
    }

    @Override
    public String getDirections() {
        return "Directions for train route";
    }
}
