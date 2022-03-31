package Patterns.Factory.Excercise;

public class SedanCar implements Car {

    @Override
    public void construct() {
        System.out.println("Se construye un coche tipo sedan");
    }
}
