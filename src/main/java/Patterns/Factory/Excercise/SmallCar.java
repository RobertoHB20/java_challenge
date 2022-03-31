package Patterns.Factory.Excercise;

public class SmallCar implements Car {

    @Override
    public void construct() {
        System.out.println("Se construlle un coche pequeño");
    }
}
