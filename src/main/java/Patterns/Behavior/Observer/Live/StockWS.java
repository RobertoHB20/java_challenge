package Patterns.Behavior.Observer.Live;

public class StockWS {

    public static void main(String[] args) {
        StockSubject stockSubject = new StockSubject();

        StockObserver stockObserver = new StockObserver(stockSubject);

//        stockSubject.setApplePrice(127);
//        stockSubject.setGooglePrice(210);
//        stockSubject.setIbmPrice(305);

        for(int i = 0 ; i < 10 ; i++){
            StockWatcher.generateStockPrice(stockSubject);
        }


    }
}
