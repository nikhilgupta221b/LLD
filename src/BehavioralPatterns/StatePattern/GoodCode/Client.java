package BehavioralPatterns.StatePattern.GoodCode;

public class Client {
    public static void main(String[] args) {
        DirectionService directionService = new DirectionService(new Car());

        directionService.setMode(new Train());
        System.out.println(directionService.getDirection());
        System.out.println(directionService.getETA());
    }
}
