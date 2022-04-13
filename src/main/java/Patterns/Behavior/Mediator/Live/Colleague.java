package Patterns.Behavior.Mediator.Live;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Colleague {

    protected IMediator mediator;

    public abstract void send(String message);
    public abstract void messageReceived(String message);
}
