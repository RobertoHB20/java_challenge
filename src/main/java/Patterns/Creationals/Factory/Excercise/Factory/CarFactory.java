package Patterns.Creationals.Factory.Excercise.Factory;

import Patterns.Creationals.Factory.Excercise.Impl.LuxuryCar;
import Patterns.Creationals.Factory.Excercise.Impl.SedanCar;
import Patterns.Creationals.Factory.Excercise.Car;
import Patterns.Creationals.Factory.Excercise.Types.CarType;
import Patterns.Creationals.Factory.Excercise.Impl.SmallCar;

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
