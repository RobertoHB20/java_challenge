package Patterns.Factory.Excercise.Impl;

import Patterns.Factory.Excercise.Car;

/**
 * Class that implements Car interface and allows to build a small car
 */
public class SmallCar implements Car {

    @Override
    public void construct() {
        System.out.println("Se construlle un coche pequeño");
    }
}
