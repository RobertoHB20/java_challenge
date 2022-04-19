package Patterns.Behavior.Template.Excercise;

public class Chess extends Game{

    @Override
    public String initialize() {
        return "Se reune dos personas";
    }

    @Override
    public String start() {
        return "Se determina quien obtiene las piezas blancas";
    }

    @Override
    public String end() {
        return "Gana el que realice jaque mate";
    }

    @Override
    public String play() {
        return "Inicia el que tenga las piezas blancas";
    }
}
