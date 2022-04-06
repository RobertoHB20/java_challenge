package Patterns.Structural.Decorator.Live;

public class RunDecorator {

    public static void main(String[] args) {
        Credit gold = new Gold();
        Credit blackWithInternationalPayment = new Black();
        blackWithInternationalPayment = new InternationalPaymentDecorator(blackWithInternationalPayment);
        Credit goldWithSecureAndInternationalPayment = new Gold();
        goldWithSecureAndInternationalPayment = new SecureDecorator(goldWithSecureAndInternationalPayment);
        goldWithSecureAndInternationalPayment = new InternationalPaymentDecorator(goldWithSecureAndInternationalPayment);

        System.out.println("-------------Tarjeta gold con configuracion");
        gold.showCredit();
        System.out.println("-------------Tarjeta black con configuracion");
        blackWithInternationalPayment.showCredit();
        System.out.println("-------------Tarjeta gold con seguridad con configuracion");
        goldWithSecureAndInternationalPayment.showCredit();


    }
}
