package BehavioralPatterns.StatePattern.GoodCode;

public class DirectionService {
    Mode mode;

    public DirectionService(Mode mode) {
        this.mode = mode;
    }

    public void setMode(Mode mode) {
        this.mode = mode;
    }

    public int getETA() {
        return mode.calcETA();
    }

    public String getDirection() {
        return mode.getDirections();
    }
}
