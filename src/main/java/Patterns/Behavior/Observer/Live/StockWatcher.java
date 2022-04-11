package Patterns.Behavior.Observer.Live;

import java.util.Random;

public class StockWatcher {


    public static void generateStockPrice(StockSubject stockSubject) {
        double[] values = new Random().doubles(3,10,10000).toArray();

        stockSubject.setApplePrice(values[0]);
        stockSubject.setGooglePrice(values[1]);
        stockSubject.setIbmPrice(values[2]);
    }
}
