package Patterns.Behavior.Strategy.Excercise;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class App {
    private Logger logger;


    public String run(String text){

        return logger.writte(text);
    }

}
