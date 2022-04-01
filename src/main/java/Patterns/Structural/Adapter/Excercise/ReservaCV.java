package Patterns.Structural.Adapter.Excercise;

import java.util.Date;

public interface ReservaCV {
    String hotelInfo(String idHotel);
    long creaReserva(String idHotel, String cliente, Date fecha, int dias);
    String datoReserva(long codigo);
}
