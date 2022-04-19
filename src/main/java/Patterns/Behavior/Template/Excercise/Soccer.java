package Patterns.Behavior.Template.Excercise;

public class Soccer extends Game{

    @Override
    public String initialize() {
        return "Reune dos equipos de 11 jugadores";
    }

    @Override
    public String start() {
        return "Se realiza un volado";
    }

    @Override
    public String end() {
        return "Gana el equipo con mas goles";
    }

    @Override
    public String play() {
        return "El ganador del volado, hace el primer movimiento";
    }
}
