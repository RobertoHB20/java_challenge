package Patterns.Structural.Decorator.Excercise;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Descafeinado implements ICafe{

    private float precio;

    @Override
    public void descripcion() {
        System.out.println("Cafe descafeinado");
    }

    @Override
    public float precio() {
        System.out.println("Costo del cafe descafeinado: " + precio);
        return this.precio;
    }
}
