package Patterns.Structural.Decorator.Excercise;

public class CremaDecorator extends AdicionalesDecorator{
    private static final float PRECIO =  4;

    public CremaDecorator(ICafe decoratedCafe) {
        super(decoratedCafe);
    }

    @Override
    public float precio() {
        float total = decoratedCafe.precio() + PRECIO;
        this.configCrema(total);
        return total;
    }

    private void configCrema(float total){

        System.out.println("Se ha agregado crema a la orden, total: " + total );
    }
}
