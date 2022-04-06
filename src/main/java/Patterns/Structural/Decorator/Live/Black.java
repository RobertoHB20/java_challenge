package Patterns.Structural.Decorator.Live;

public class Black implements Credit{
    @Override
    public void showCredit() {
        System.out.println("El credito es de un millon");
    }
}
