package Patterns.Prototype.Live;

public interface PrototypeCard extends Cloneable {

    PrototypeCard clone() throws CloneNotSupportedException;

    void getCard();
}
