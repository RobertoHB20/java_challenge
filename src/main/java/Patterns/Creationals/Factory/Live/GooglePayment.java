package Patterns.Creationals.Factory.Live;

public class GooglePayment implements Payment{

    @Override
    public void doPayment() {
        System.out.println("Pago con google payment");
    }
}
