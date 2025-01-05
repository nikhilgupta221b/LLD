package ObservableDesignPattern.Observables;

import ObservableDesignPattern.Observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements Observable {
    List<Observer> observers = new ArrayList<Observer>();
    int stock = 0;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    @Override
    public void setStock(int stock) {
        int oldStock = this.stock;
        this.stock += stock;
        if (oldStock == 0) {
            notifyObservers();
        }
    }

    @Override
    public int getStock() {
        return this.stock;
    }
}
