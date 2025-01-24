package BehaviouralPatterns.ObserverPattern.GoodCode;

public class DisplayDevice implements Observer {

    @Override
    public void update(float temp) {
        System.out.println("Current Temperature in Display: " + temp);
    }
}
