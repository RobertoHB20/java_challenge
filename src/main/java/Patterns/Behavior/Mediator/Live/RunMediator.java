package Patterns.Behavior.Mediator.Live;

public class RunMediator {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleague1 user1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 user2 = new ConcreteColleague2(mediator);

        mediator.setUser1(user1);
        mediator.setUser2(user2);

        user1.send("Hola soy el usuario 1");
        user2.send("Hola usuario 1, soy el usuario 2");
    }
}
