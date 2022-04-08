package Patterns.Behavior.ChainOfResponsability.Excercise;

public class President extends Approver{
    public President(String name) {
        super(name);
    }

    @Override
    public String processRequest(Purchase purchase) {
        if (purchase.getAmount() < 100000){
            return String.format("%s approved request# %d", this.name, purchase.getNumber());
        }
        return String.format("Request# %d requires an executive meeting!",  purchase.getNumber());
    }
}
