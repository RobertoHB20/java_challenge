package Patterns.Behavior.Strategy.Excercise2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MathContext {

    private MathAlgorithm mathAlgorithm;

    public int execute(int num1, int num2){
        return this.mathAlgorithm.calculate(num1, num2);
    }
}
