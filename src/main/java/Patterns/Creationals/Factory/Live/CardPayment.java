package Patterns.Creationals.Factory.Live;

public class CardPayment implements Payment{


    @Override
    public void doPayment() {
        System.out.println("Pago con tarjeta de debito");
    }
}
