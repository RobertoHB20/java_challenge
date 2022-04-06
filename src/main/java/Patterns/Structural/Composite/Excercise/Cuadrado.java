package Patterns.Structural.Composite.Excercise;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Cuadrado implements IGrafico{

    private float lado;

    @Override
    public void pintar() {

        double area = Math.pow(lado, 2);

        System.out.println("El area del cuadrado es: " + area);

    }
}
