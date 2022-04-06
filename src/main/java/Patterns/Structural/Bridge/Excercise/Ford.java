package Patterns.Structural.Bridge.Excercise;

public class Ford extends Vehiculo{

    public Ford(IMotor motor) {
        super(motor);
    }

    @Override
    public void mostrarCaracteristicas() {

        this.motor.inyectarCombustible(300);
        this.motor.consumirGasolina();
    }
}
