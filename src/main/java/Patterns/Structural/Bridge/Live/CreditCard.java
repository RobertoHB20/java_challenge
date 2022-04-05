package Patterns.Structural.Bridge.Live;

public abstract class CreditCard {
    protected ICreditCard card;

    public CreditCard(ICreditCard card) {
        this.card = card;
    }

    public abstract void realizarPago();
}
