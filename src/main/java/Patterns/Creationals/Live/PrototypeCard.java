package Patterns.Creationals.Live;

public interface PrototypeCard extends Cloneable {

    PrototypeCard clone() throws CloneNotSupportedException;

    void getCard();
}
