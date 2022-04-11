package Patterns.Behavior.Observer.Live;

public interface Subject {

    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObserver();
}
