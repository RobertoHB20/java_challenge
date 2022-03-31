package Patterns.Factory.Excercise.Impl;

import Patterns.Factory.Excercise.Car;

/**
 * Class that implements Car interface and allows to build a sedan car
 */
public class SedanCar implements Car {

    @Override
    public void construct() {
        System.out.println("Se construye un coche tipo sedan");
    }
}
