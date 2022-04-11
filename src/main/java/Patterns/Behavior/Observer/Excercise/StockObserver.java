package Patterns.Behavior.Observer.Excercise;

public class StockObserver implements Observer {

    private static int observerIdGenerator=0;
    private int observerID;

    public StockObserver(Subject stockSubject) {
        stockSubject.register(this);
        observerID =++ observerIdGenerator;
    }

    @Override
    public void update(Stock stock) {
        System.out.println("Observer id: " + observerID + "\n" + stock.getNombre() + ": " +  stock.getPrecio());
    }
}
