package BehaviouralPatterns.ObserverPattern.GoodCode;

public class MobileDevice implements Observer {
    @Override
    public void update(float temp) {
        System.out.println("Current Temperature in Mobile: " + temp);
    }
}
