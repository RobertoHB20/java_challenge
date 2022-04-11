package Patterns.Behavior.Observer.Live;

public class StockObserver implements Observer{

    private static int observerIdGenerator=0;
    private int observerID;

    public StockObserver(Subject stockSubject) {
        stockSubject.register(this);
        observerID =++ observerIdGenerator;
    }

    @Override
    public void update(double ibmPrice, double applePrice, double googlePrice) {
        System.out.println("Observer id: " + observerID + "\n" +
                "IBM: " +  ibmPrice + "\n" +
                "Apple: " +  applePrice + "\n" +
                "Google: " +  googlePrice + "\n");
    }
}
