package Patterns.Behavior.Mediator.Live;

public class ConcreteColleague2 extends Colleague{

    public ConcreteColleague2(IMediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        mediator.send(message, this);
    }

    @Override
    public void messageReceived(String message) {
        System.out.println("Colega 2 ha recibido el siguiente mensaje:" + message);
    }
}
