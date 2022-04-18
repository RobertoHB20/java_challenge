package Patterns.Behavior.Mediator.Exercise;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Aparato {

    protected IMediator mediator;

    public abstract String endender();
    public abstract String apagar();
}
