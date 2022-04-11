package Patterns.Behavior.Observer.Excercise;

import java.util.ArrayList;
import java.util.List;

public class StockSubject implements Subject {

    private Stock stock;

    public StockSubject(Stock stock) {
        this.stock = stock;
    }

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
        observers.stream().forEach( e -> e.update(this.stock) );
    }


    public void setPrice(double price) {
        this.stock.setPrecio(price);
        this.notifyObserver();
    }

}
