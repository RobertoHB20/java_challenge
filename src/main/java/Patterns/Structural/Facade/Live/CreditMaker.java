package Patterns.Structural.Facade.Live;

public class CreditMaker {

    private ICredit gold;
    private ICredit silver;
    private ICredit black;

    public CreditMaker(){
        gold = new Gold();
        silver = new Silver();
        black = new Black();
    }

    public void showCreditGold(){
        gold.showCredit();
    }

    public void showCreditSilver(){
        silver.showCredit();
    }

    public void showCreditBlack(){
        black.showCredit();
    }
}
