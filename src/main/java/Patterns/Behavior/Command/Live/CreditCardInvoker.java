package Patterns.Behavior.Command.Live;

import lombok.Setter;

@Setter
public class CreditCardInvoker {

    private ICommand command;

    public void run(){
        command.execute();
    }
}
