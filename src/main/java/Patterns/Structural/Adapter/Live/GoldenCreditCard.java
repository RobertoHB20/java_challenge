package Patterns.Structural.Adapter.Live;

public class GoldenCreditCard implements Secure{

    @Override
    public void playWithSecureLevelA() {
        // no implementar
    }

    @Override
    public void playWithSecureLevelZ() {
        System.out.println("Tarjeta gold: pagando con seguridad BAJA");
    }
}
