package Patterns.Structural.Decorator.Live;

public class Gold implements Credit{

    @Override
    public void showCredit() {
        System.out.println("El credito es de cincuenta mil");
    }
}
