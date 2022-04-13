package Patterns.Behavior.Mediator.Live;

public interface IMediator {

    void send(String message, Colleague colleague);
}
