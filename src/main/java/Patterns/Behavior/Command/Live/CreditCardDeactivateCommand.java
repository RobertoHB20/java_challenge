package Patterns.Behavior.Command.Live;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreditCardDeactivateCommand implements ICommand{

    private CreditCard creditCard;


    @Override
    public void execute() {
        this.creditCard.desactivate();
        this.creditCard.sendSMSToCustomerDeactive();
    }
}
