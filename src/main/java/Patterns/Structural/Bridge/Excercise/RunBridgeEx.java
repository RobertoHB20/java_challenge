package Patterns.Structural.Bridge.Excercise;

public class RunBridgeEx {

    public static void main(String[] args) {
        Vehiculo ford = new Ford( new Diesel());
        ford.mostrarCaracteristicas();

        Vehiculo ford_2 = new Ford(new Gasolina());
        ford_2.mostrarCaracteristicas();

    }
}
