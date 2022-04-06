package Patterns.Structural.Decorator.Excercise;

public class RunDecoradorEx {

    public static void main(String[] args) {
        ICafe cafeNegro = new Normal(10);

        ICafe cafeConCrema = new Normal(10);
        cafeConCrema = new LecheDecorator(cafeConCrema);

        ICafe cafeDecafConCremAzucar = new Descafeinado(15);
        cafeDecafConCremAzucar = new CremaDecorator(cafeDecafConCremAzucar);
        cafeDecafConCremAzucar = new AzucarDecorator(cafeDecafConCremAzucar);

        System.out.println("-----------------  CAFE NORMAL  -----------");
        cafeNegro.descripcion();
        cafeNegro.precio();

        System.out.println("-----------------  CAFE CON CREMA  -----------");
        cafeConCrema.descripcion();
        cafeConCrema.precio();

        System.out.println("-----------------  CAFE DESCAFEINADO CON CREMA Y AZUCAR  -----------");
        cafeDecafConCremAzucar.descripcion();
        cafeDecafConCremAzucar.precio();


    }
}
