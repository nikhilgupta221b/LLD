package BehavioralPatterns.StatePattern.BadCode;


public class DirectionService {
    private TransportationMode transportationMode;

    public DirectionService(TransportationMode transportationMode) {
        this.transportationMode = transportationMode;
    }

    public void setTransportationMode(TransportationMode transportationMode) {
        this.transportationMode = transportationMode;
    }

    public int getETA() {
        switch (transportationMode) {
            case WALK:
                System.out.println("Calc ETA for walk...");
                return 10;

            case CYCLE:
                System.out.println("Calc ETA for cycle...");
                return 5;

            case CAR:
                System.out.println("Calc ETA for car...");
                return 2;

            case TRAIN:
                System.out.println("Calc ETA for train...");
                return 3;

            default:
                throw new IllegalArgumentException("Invalid TransportationMode");
        }
    }

    public String getDirection() {
        switch (transportationMode) {
            case WALK:
                return "Directions for walking: Head north for 500 meters.";
            case CYCLE:
                return "Directions for cycling: Take the bike lane on Elm Street.";
            case CAR:
                return "Directions for driving: Use highway 50 towards downtown.";
            case TRAIN:
                return "Directions for train: Board the Red Line at Central Station.";
            default:
                return "No directions available for the selected mode.";
        }
    }
}
