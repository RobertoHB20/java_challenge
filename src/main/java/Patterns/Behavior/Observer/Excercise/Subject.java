package Patterns.Behavior.Observer.Excercise;

public interface Subject {

    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObserver();
}
