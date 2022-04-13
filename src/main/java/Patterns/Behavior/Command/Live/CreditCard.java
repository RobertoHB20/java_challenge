package Patterns.Behavior.Command.Live;

public class CreditCard {

    public void sendPinNumberToCustomer(){
        System.out.println("El pin number ha sido enviado al cliente");
    }

    public void sendSMSToCustomerActive(){
        System.out.println("Enviado SMS al cliente informando que su tarjeta ha sido activada");
    }

    public void sendSMSToCustomerDeactive(){
        System.out.println("Enviado SMS al cliente informando que su tarjeta ha sido desactivada");
    }

    public void activate(){
        System.out.println("La tarjeta ha sido activada");
    }

    public void desactivate(){
        System.out.println("La tarjeta ha sido desactivada");
    }
}
