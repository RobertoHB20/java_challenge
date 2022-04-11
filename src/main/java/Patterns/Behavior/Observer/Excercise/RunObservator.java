package Patterns.Behavior.Observer.Excercise;

public class RunObservator {

    public static void main(String[] args) {
        Stock ibm = new Stock("IBM", 100.0);
        Stock apple = new Stock("Apple", 800.23);
        Stock google = new Stock("Google", 500);

        StockSubject ibmSubject = new StockSubject(ibm);
        StockSubject appleSubject= new StockSubject(apple);
        StockSubject googleSubject = new StockSubject(google);

        StockObserver observer1 = new StockObserver(ibmSubject);
        StockObserver observer2 = new StockObserver(ibmSubject);

        StockObserver observer3 = new StockObserver(appleSubject);


        ibmSubject.setPrice(200);
        appleSubject.setPrice(100);


    }
}
