package Patterns.Factory.Excercise.Factory;

import Patterns.Factory.Excercise.Car;
import Patterns.Factory.Excercise.Types.CarType;
import Patterns.Factory.Excercise.Impl.LuxuryCar;
import Patterns.Factory.Excercise.Impl.SedanCar;
import Patterns.Factory.Excercise.Impl.SmallCar;

/**
 * Class Factory that allows the generation of different type of cars
 */
public class CarFactory {

    /**
     * Builder method that allow to build a selected car, if car doesn't exist it will return null
     * @param carType
     * @return Car
     */
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
