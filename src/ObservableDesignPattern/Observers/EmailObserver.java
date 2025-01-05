package ObservableDesignPattern.Observers;

import ObservableDesignPattern.Observables.Observable;

public class EmailObserver implements Observer{
    Observable observable;
    String email;
    public EmailObserver(Observable observable, String email) {
        this.observable = observable;
        this.email = email;
    }

    public void update() {
        System.out.println("Notified user " + email + " via email. That stock " + observable.getStock() + " is available.");
    }
}
