package Patterns.Structural.Decorator.Excercise;

public class AzucarDecorator extends AdicionalesDecorator{

    private static final float PRECIO =  2;

    public AzucarDecorator(ICafe decoratedCafe) {
        super(decoratedCafe);
    }

    @Override
    public float precio() {
        float total = decoratedCafe.precio() + PRECIO;
        this.configAzucar(total);
        return total;
    }

    private void configAzucar(float total){

        System.out.println("Se ha agregado azucar a la orden, total: " + total );
    }
}
