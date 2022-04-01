package Patterns.Structural.Adapter.Live;

public class BlackCreditCard implements Secure{
    @Override
    public void playWithSecureLevelA() {
        System.out.println("Tarjeta black: pagando con seguridad ALTA");
    }

    @Override
    public void playWithSecureLevelZ() {
        // no implementar
    }
}
