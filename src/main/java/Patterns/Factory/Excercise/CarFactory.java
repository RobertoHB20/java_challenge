package Patterns.Factory.Excercise;

public class CarFactory {

    public static Car buidCar(CarType carType){
        switch (carType){
            case SMALL:
                return new SmallCar();
            case SEDAN:
                return new SedanCar();
            case LUXURY:
                return new LuxuryCar();
            default:
                return null;
        }
    }
}
