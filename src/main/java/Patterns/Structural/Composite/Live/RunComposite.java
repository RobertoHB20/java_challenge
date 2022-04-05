package Patterns.Structural.Composite.Live;

public class RunComposite {

    public static void main(String[] args) {
        AccountComponent currentAccount = new CurrentAccount(100.0, "Monse");
        AccountComponent savingAccunt = new SavingAccount(2000.0, "Monse");

        AccountComposite accountComposite = new AccountComposite();
        accountComposite.addAccount(currentAccount);
        accountComposite.addAccount(savingAccunt);

        accountComposite.showAccount();
        accountComposite.getAmount();
    }
}
