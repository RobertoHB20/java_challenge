package Patterns.Structural.Bridge.Live;

public class RunBridge {

    public static void main(String[] args) {
        CreditCard classic = new ClassicCreditCard(new UnSecureCreditCard());
        classic.realizarPago();

        CreditCard black = new ClassicCreditCard(new SecureCreditCard());
        black.realizarPago();
    }
}
