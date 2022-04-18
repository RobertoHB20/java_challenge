package Patterns.Behavior.Command.Exercise;

import lombok.Setter;

@Setter
public class Oficina {

    private TratamientoPedido tratamientoPedido;

    public String run(){
        return tratamientoPedido.tratar();
    }
}
