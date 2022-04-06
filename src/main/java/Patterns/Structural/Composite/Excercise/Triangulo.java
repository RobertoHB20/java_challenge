package Patterns.Structural.Composite.Excercise;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Triangulo implements IGrafico{

    private float base;
    private float altura;

    @Override
    public void pintar() {

        double area = (base * altura) / 2;

        System.out.println("El area del triangulo es: " + area);

    }
}
