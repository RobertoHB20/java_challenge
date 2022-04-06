package Patterns.Structural.Decorator.Live;

public class InternationalPaymentDecorator extends CreditDecorator{

    public InternationalPaymentDecorator(Credit decoratedCredit) {
        super(decoratedCredit);
    }

    @Override
    public void showCredit(){
        this.decoratedCredit.showCredit();
        config();
    }

    private void config(){
        System.out.println("La tarjeta ha sido configurada para PAGOS INTERNACIONALES");
    }
}
