package Patterns.Behavior.Command.Live;

public class RunCommand {

    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        CreditCard creditCard1 = new CreditCard();


        CreditCardInvoker invoker = new CreditCardInvoker();
        invoker.setCommand(new CreditCardActivateCommand(creditCard));
        invoker.run();
        System.out.println("----------------------------");
        invoker.setCommand(new CreditCardDeactivateCommand(creditCard1));
        invoker.run();
    }
}
