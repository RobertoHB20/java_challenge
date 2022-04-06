package Patterns.Structural.Facade.Live;

public class RunFacade {

    public static void main(String[] args) {
        CreditMaker creditMaker = new CreditMaker();

        creditMaker.showCreditSilver();
        creditMaker.showCreditBlack();
        creditMaker.showCreditGold();
    }
}
