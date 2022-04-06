package Patterns.Structural.Decorator.Excercise;

public class LecheDecorator extends AdicionalesDecorator{

    private static final float PRECIO =  10;

    public LecheDecorator(ICafe decoratedCafe) {
        super(decoratedCafe);
    }

    @Override
    public float precio() {
        float total = decoratedCafe.precio() + PRECIO;
        this.configLeche(total);
        return total;
    }

    private void configLeche(float total){

        System.out.println("Se ha agregado leche a la orden, total: " + total );
    }

}
