package Patterns.Behavior.Command.Exercise;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PedidoPeligroso {
    private String instrucciones;
    private int peso;

    public String instrucciones(){
        return this.instrucciones;
    }
}
