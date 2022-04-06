package Patterns.Structural.Decorator.Excercise;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Normal implements ICafe{

    private float precio;


    @Override
    public void descripcion() {
        System.out.println("Cafe normal");

    }

    @Override
    public float precio() {
        System.out.println("Costo del cafe normal: " + precio);
        return this.precio;
    }
}
