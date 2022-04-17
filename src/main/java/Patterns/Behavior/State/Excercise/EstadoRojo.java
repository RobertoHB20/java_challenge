package Patterns.Behavior.State.Excercise;

public class EstadoRojo implements EstadoSemaforo{
    @Override
    public String mostrar() {
        return "¡Alto!";
    }
}
