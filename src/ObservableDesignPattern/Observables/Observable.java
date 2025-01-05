package ObservableDesignPattern.Observables;

import ObservableDesignPattern.Observers.Observer;

public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
    void setStock(int stock);
    int getStock();

}
