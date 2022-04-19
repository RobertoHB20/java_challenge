package Patterns.Behavior.Strategy.Excercise;

public class FileLogger implements Logger{

    @Override
    public String writte(String text) {
        return "Wrote on file: " + text;
    }
}
