package Patterns.Behavior.State.Excercise;

public class EstadoVerde implements EstadoSemaforo{


    @Override
    public String mostrar() {
        return "Puede avanzar";
    }
}
