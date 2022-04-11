package Patterns.Behavior.Observer.Live;

import java.util.ArrayList;
import java.util.List;

public class StockSubject implements Subject{

    private double ibmPrice;
    private double applePrice;
    private double googlePrice;

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observers.stream().forEach( e -> e.update(ibmPrice, applePrice, googlePrice) );
    }


    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        this.notifyObserver();
    }

    public void setApplePrice(double applePrice) {
        this.applePrice = applePrice;
        this.notifyObserver();
    }

    public void setGooglePrice(double googlePrice) {
        this.googlePrice = googlePrice;
        this.notifyObserver();
    }
}
