package Patterns.Structural.Composite.Excercise;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Circulo implements IGrafico{

    private float radio;

    @Override
    public void pintar() {
        double area = Math.round( Math.PI * Math.pow(radio, 2) );
        System.out.println("El area del circulo es: " + area);
    }
}
