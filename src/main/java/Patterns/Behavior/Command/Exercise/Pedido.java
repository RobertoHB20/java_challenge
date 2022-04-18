package Patterns.Behavior.Command.Exercise;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Setter
@Getter
@AllArgsConstructor
public class Pedido {

    private int peso;
    private boolean is_urgente;

    public boolean isUrgente(){
        return is_urgente;
    }


}
