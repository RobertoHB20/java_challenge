package Patterns.Behavior.Mediator.Live;

public class ConcreteColleague1 extends Colleague{


    public ConcreteColleague1(IMediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        mediator.send(message, this);
    }

    @Override
    public void messageReceived(String message) {
        System.out.println("Colega 1 ha recibido el siguiente mensaje:" + message);
    }
}
