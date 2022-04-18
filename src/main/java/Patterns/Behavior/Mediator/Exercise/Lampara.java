package Patterns.Behavior.Mediator.Exercise;

public class Lampara extends Aparato{
    public Lampara(IMediator mediator) {
        super(mediator);
    }

    @Override
    public String endender() {

        return this.mediator.encender(this);
    }

    @Override
    public String apagar() {

        return this.mediator.apagar(this);
    }
}
