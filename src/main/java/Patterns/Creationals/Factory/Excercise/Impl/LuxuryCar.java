package Patterns.Creationals.Factory.Excercise.Impl;

import Patterns.Creationals.Factory.Excercise.Car;

/**
 * Class that implements Car interface to build a Luxury car
 */
public class LuxuryCar implements Car {


    @Override
    public void construct() {
        System.out.println("Se construye un coche de lujo");
    }
}
