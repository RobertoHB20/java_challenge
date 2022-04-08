package Patterns.Behavior.ChainOfResponsability.Excercise;

public class VicePresident extends Approver {
    public VicePresident(String name) {
        super(name);
    }

    @Override
    public String processRequest(Purchase purchase) {
        if (purchase.getAmount() < 25000){
            return String.format("%s approved request# %d", this.name, purchase.getNumber());
        }
        return successor.processRequest(purchase);
    }
}
