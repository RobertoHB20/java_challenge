package Patterns.Behavior.Mediator.Exercise;

import lombok.ToString;

@ToString
public class Tele extends Aparato{


    public Tele(IMediator mediator) {
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
