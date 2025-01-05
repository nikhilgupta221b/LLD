package ObservableDesignPattern;

import ObservableDesignPattern.Observables.IphoneObservable;
import ObservableDesignPattern.Observables.MacbookObservable;
import ObservableDesignPattern.Observers.EmailObserver;
import ObservableDesignPattern.Observers.MobileAppObserver;
import ObservableDesignPattern.Observers.Observer;

public class Main {
    public static void main(String[] args) {

        // Two products available to be tracked
        IphoneObservable iphoneObservable = new IphoneObservable();
        MacbookObservable macbookObservable = new MacbookObservable();


        // Subscribed to be notified on mobile app for iphone stock
        Observer observer1 = new MobileAppObserver(iphoneObservable, "richchintu");

        /// Subscribed to be notified on mobile app for macbook stock
        Observer observer2 = new MobileAppObserver(macbookObservable, "richmintu");

        /// Subscribed to be notified on email for macbook stock
        Observer observer3 = new EmailObserver(macbookObservable, "richpintu");

        // observable list is updated to notify these observers
        iphoneObservable.addObserver(observer1);
        macbookObservable.addObserver(observer2);
        macbookObservable.addObserver(observer3);

        // Stock updated for both products
        iphoneObservable.setStock(20);
        macbookObservable.setStock(25);
    }
}
