package Patterns.Structural.Composite.Excercise;

public class RunComposite {

    public static void main(String[] args) {
        IGrafico circulo = new Circulo( 3 );
        IGrafico cuadrado = new Cuadrado(5);
        IGrafico triangulo = new Triangulo(2,6);

        GrupoDeImagenes grupo = new GrupoDeImagenes();
        grupo.addGrafico(circulo);
        grupo.addGrafico(cuadrado);
        grupo.addGrafico(triangulo);

        grupo.pintar();
    }

}
