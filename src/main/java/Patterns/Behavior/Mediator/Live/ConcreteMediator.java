package Patterns.Behavior.Mediator.Live;

import lombok.Setter;

@Setter
public class ConcreteMediator implements IMediator{

    private ConcreteColleague1 user1;
    private ConcreteColleague2 user2;




    @Override
    public void send(String message, Colleague colleague) {
        if (colleague == user1){
            user2.messageReceived(message);
        }
        else if(colleague == user2){
            user1.messageReceived(message);
        }
    }
}
