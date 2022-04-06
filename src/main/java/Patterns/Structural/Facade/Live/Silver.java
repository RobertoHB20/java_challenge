package Patterns.Structural.Facade.Live;

public class Silver implements ICredit{
    @Override
    public void showCredit() {
        System.out.println("La tarjeta tiene un credito de 200 mil");
    }
}
