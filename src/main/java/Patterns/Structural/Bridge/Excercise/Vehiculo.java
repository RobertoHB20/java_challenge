package Patterns.Structural.Bridge.Excercise;

public abstract class Vehiculo {

    protected IMotor motor;

    public Vehiculo(IMotor motor) {
        this.motor = motor;
    }

    public abstract void mostrarCaracteristicas();
}
