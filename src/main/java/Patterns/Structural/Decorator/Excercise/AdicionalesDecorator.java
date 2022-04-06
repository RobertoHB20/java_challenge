package Patterns.Structural.Decorator.Excercise;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AdicionalesDecorator implements ICafe{

    protected ICafe decoratedCafe;



    @Override
    public void descripcion() {
        decoratedCafe.descripcion();
    }

    @Override
    public float precio() {
        return decoratedCafe.precio();

    }
}
