package Patterns.Structural.Adapter.Excercise;

import java.time.Instant;
import java.util.Date;

public class RunAdapter {

    public static void main(String[] args) {
        String id_hotel = "123";
        Date date = Date.from(Instant.now());
        int dias = 4;
        String client = "Julio Cortes";

        StandarReservaACME standarReservaACME = new StandarReservaAdapter( new ReservaCVImpl() );

        String codigo = standarReservaACME.creaReserva(date, dias, id_hotel, client);
        System.out.println( "Numero de reserva: " +  codigo);
        System.out.println( "\nInfo del hotel: " +  standarReservaACME.getInfo(id_hotel) );
        System.out.println( "\nDatos de la reservacion: \n" + standarReservaACME.datoReserva(codigo));


    }
}
