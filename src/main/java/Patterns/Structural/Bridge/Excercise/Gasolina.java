package Patterns.Structural.Bridge.Excercise;

import java.util.Random;

public class Gasolina implements IMotor{

    private double combustible;

    public Gasolina() {
        this.combustible = 100;
    }

    @Override
    public void inyectarCombustible(double cantidad) {
        this.combustible = cantidad;
        System.out.println("Se ha inyectado: "+ combustible + "L de gasolina");

    }

    @Override
    public void consumirGasolina() {
        double consumir= Math.round((new Random().nextDouble()) * (combustible));

        System.out.println("Gasolina consumida: " + consumir);
        this.combustible = combustible - consumir;

    }
}
