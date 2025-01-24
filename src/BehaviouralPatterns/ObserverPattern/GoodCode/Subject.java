package BehaviouralPatterns.ObserverPattern.GoodCode;

public interface Subject {
    void attachObserver(Observer o);
    void detachObserver(Observer o);
    void notifyObservers();
}
