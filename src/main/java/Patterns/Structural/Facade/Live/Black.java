package Patterns.Structural.Facade.Live;

public class Black implements ICredit{
    @Override
    public void showCredit() {
        System.out.println("La tarjeta tiene un credito de 1 millon");
    }
}
