package Patterns.Behavior.Command.Live;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreditCardActivateCommand implements ICommand{

    private CreditCard creditCard;


    @Override
    public void execute() {
        this.creditCard.sendPinNumberToCustomer();
        this.creditCard.activate();
        this.creditCard.sendSMSToCustomerActive();
    }
}
