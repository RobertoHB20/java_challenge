package Patterns.Factory.Excercise;

public class RunFactory {

    public static void main(String[] args) {
        Car sedan = CarFactory.buidCar(CarType.SEDAN);
        sedan.construct();

        Car smallCar = CarFactory.buidCar(CarType.SMALL);
        smallCar.construct();

        Car luxuryCar = CarFactory.buidCar(CarType.LUXURY);
        luxuryCar.construct();
    }
}
