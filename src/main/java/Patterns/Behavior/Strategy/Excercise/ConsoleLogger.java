package Patterns.Behavior.Strategy.Excercise;

public class ConsoleLogger implements Logger{
    @Override
    public String writte(String text) {
        return "Console: " + text ;
    }
}
