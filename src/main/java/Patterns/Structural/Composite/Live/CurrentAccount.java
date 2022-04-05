package Patterns.Structural.Composite.Live;

public class CurrentAccount implements AccountComponent{

    private Double amount;
    private String name;

    public CurrentAccount(Double amount, String name) {
        this.amount = amount;
        this.name = name;
    }

    @Override
    public void showAccount() {
        System.out.println("Current account: " + this.name);
    }

    @Override
    public Double getAmount() {
        return this.amount;
    }
}
