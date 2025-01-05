package ObservableDesignPattern.Observers;

import ObservableDesignPattern.Observables.Observable;

public class MobileAppObserver implements Observer{
    Observable observable;
    String username;

    public MobileAppObserver(Observable observable, String username) {
        this.observable = observable;
        this.username = username;
    }

    public void update() {
        System.out.println("Notified user " + username + " via app notification. That stock " + observable.getStock() + " is available.");
    }
}
