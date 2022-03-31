package Patterns.Creationals.Factory.Excercise;

import Patterns.Creationals.Factory.Excercise.Factory.CarFactory;
import Patterns.Creationals.Factory.Excercise.Types.CarType;

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
