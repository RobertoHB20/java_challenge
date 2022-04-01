package Patterns.Structural.Adapter.Live;

public class CreditCard implements Payment{

    Adapter adapter;

    public CreditCard(){

    }

    @Override
    public void pay(String typePayment) {
        if ("CLASSIC".equals(typePayment)){
            System.out.println("Tarjeta classic: pagando sin ningun tipo de seguridad");
        }
        else if ("GOLD".equals(typePayment)){
            adapter = new Adapter(typePayment);
            adapter.pay(typePayment);
        }
        else if ("BLACK".equals(typePayment)){
            adapter = new Adapter(typePayment);
            adapter.pay(typePayment);
        }
        else{
            System.out.println("No se puede realizar el pago, no se reconoce la tarjeta");
        }
    }
}
