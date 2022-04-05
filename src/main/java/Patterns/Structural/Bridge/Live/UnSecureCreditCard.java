package Patterns.Structural.Bridge.Live;

public class UnSecureCreditCard implements ICreditCard{

    @Override
    public void realizarPago() {
        System.out.println("Pago realizado sin seguridad");
    }
}
