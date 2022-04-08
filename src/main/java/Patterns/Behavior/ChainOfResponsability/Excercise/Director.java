package Patterns.Behavior.ChainOfResponsability.Excercise;

public class Director extends Approver{

    public Director(String name) {
        super(name);
    }

    @Override
    public String processRequest(Purchase purchase) {
        if (purchase.getAmount() < 10000){
            return String.format("%s approved request# %d", this.name, purchase.getNumber());
        }

        return successor.processRequest(purchase);
    }
}
