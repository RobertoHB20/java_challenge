package Patterns.Structural.Bridge.Excercise;

import java.util.Random;

public class Diesel implements IMotor{

    private double combustible;

    public Diesel() {
        this.combustible = 100;
    }

    @Override
    public void inyectarCombustible(double cantidad) {
        this.combustible = cantidad;
        System.out.println("Se ha inyectado: "+ combustible + "L de diesel");

    }

    @Override
    public void consumirGasolina() {
        double consumir= Math.round((new Random().nextDouble()) * (combustible));

        System.out.println("Diesel consumido: " + consumir);
        this.combustible = combustible - consumir;

    }
}
