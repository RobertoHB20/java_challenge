package Patterns.Structural.Composite.Live;

import java.util.ArrayList;
import java.util.List;

public class AccountComposite implements AccountComponent{

    private List<AccountComponent> childAccount;

    public AccountComposite() {
        this.childAccount = new ArrayList<>();
    }

    @Override
    public void showAccount() {
        childAccount.stream().forEach( e -> e.showAccount() );
    }

    @Override
    public Double getAmount() {
        Double totalAmount = 0.0;
        for(AccountComponent accountComponent: childAccount){
            totalAmount += accountComponent.getAmount();
        }
        System.out.println("La cantidad de dinero es: " + totalAmount);
        return totalAmount;
    }

    public void addAccount(AccountComponent accountComponent){
        childAccount.add(accountComponent);
    }

    public void removeAccount(AccountComponent accountComponent){
        childAccount.remove(accountComponent);
    }
}
