package Patterns.Structural.Composite.Live;

public class SavingAccount implements AccountComponent{

    private Double amount;
    private String name;

    public SavingAccount(Double amount, String name) {
        this.amount = amount;
        this.name = name;
    }

    @Override
    public void showAccount() {
        System.out.println("Saving account: " + this.name);
    }

    @Override
    public Double getAmount() {
        return this.amount;
    }
}
