package Patterns.Prototype.Live;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Visa implements PrototypeCard{
    private String name;

    @Override
    public PrototypeCard clone() throws CloneNotSupportedException {
        System.out.println("Tarjeta de credito clonada");
        return (Visa) super.clone();
    }

    @Override
    public void getCard() {
        System.out.println("Esto es una tarjeta Visa");
    }
}
