package Patterns.Creationals.Live;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Amex implements PrototypeCard{
    private String name;

    @Override
    public PrototypeCard clone() throws CloneNotSupportedException {
        System.out.println("Tarjeta de credito clonada");
        return (Amex) super.clone();
    }

    @Override
    public void getCard() {
        System.out.println("Esto es una tarjeta Amex");
    }
}
