package Patterns.Behavior.State.Excercise;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
public class Semaforo {
    private EstadoSemaforo currentState;


    String mostrar(){

        return this.currentState.mostrar();
    }



}
