package Patterns.Behavior.ChainOfResponsability.Excercise;

import lombok.Setter;

@Setter
public abstract class Approver {

    protected String name;
    protected Approver successor;

    public Approver(String name) {
        this.name = name;
    }

    public abstract String processRequest(Purchase purchase);
}
