package BehavioralPatterns.ObserverPattern.GoodCode;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
    private final List<Observer> observers;
    private float temperature;

    WeatherStation() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void attachObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void detachObserver(Observer o) {
        observers.remove(o);
    }

    public void updateTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(temperature);
        }
    }
}
