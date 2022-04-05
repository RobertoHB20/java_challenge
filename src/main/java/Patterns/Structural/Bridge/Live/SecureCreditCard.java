package Patterns.Structural.Bridge.Live;

public class SecureCreditCard implements ICreditCard{


    @Override
    public void realizarPago() {
        System.out.println("Pago realizado con seguridad");
    }
}
