package Patterns.Structural.Decorator.Live;

public class CreditDecorator implements Credit{

    protected Credit decoratedCredit;

    public CreditDecorator(Credit decoratedCredit) {
        this.decoratedCredit = decoratedCredit;
    }


    @Override
    public void showCredit() {
        this.decoratedCredit.showCredit();
    }
}
