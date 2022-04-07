package Patterns.Structural.Facade.Excercise;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CRMSystem implements ISystem{

    private final String something;

    @Override
    public void doSomething() {
        System.out.println(something);
    }
}
