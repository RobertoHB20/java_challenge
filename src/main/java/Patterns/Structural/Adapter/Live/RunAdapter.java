package Patterns.Structural.Adapter.Live;

public class RunAdapter {

    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        creditCard.pay("CLASSIC");
        creditCard.pay("VISA");
        creditCard.pay("GOLD");
        creditCard.pay("BLACK");
    }
}
