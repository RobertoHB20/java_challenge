package Patterns.Structural.Adapter.Excercise;

import java.util.Date;

public interface StandarReservaACME {

    String getInfo(String idHotel);
    String creaReserva(Date fecha, int dias, String idHotel, String cliente);
    String datoReserva(String codigo);
}
