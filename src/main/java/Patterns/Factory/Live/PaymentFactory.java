package Patterns.Factory.Live;

public class PaymentFactory {
    public static Payment buildPayment(TypePayment typePayment){
        switch (typePayment){
            case CARD:
                return new CardPayment();
            case GOOGLEPAY:
                return new GooglePayment();
            default:
                return new CardPayment();
        }
    }
}
