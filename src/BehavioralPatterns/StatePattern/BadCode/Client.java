package BehavioralPatterns.StatePattern.BadCode;

public class Client {
    public static void main(String[] args) {
        DirectionService directionService = new DirectionService(TransportationMode.TRAIN);

        directionService.setTransportationMode(TransportationMode.CYCLE);
        System.out.println(directionService.getDirection());
        System.out.println(directionService.getETA());
    }
}
