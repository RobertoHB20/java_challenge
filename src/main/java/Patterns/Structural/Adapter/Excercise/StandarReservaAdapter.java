package Patterns.Structural.Adapter.Excercise;

import java.util.Date;

public class StandarReservaAdapter implements StandarReservaACME{

    ReservaCV miSistema;

    public StandarReservaAdapter(ReservaCV miSistema) {
        this.miSistema = miSistema;
    }

    @Override
    public String getInfo(String idHotel) {
        String result = miSistema.hotelInfo(idHotel);
        return result;
    }

    @Override
    public String creaReserva(Date fecha, int dias, String idHotel, String cliente) {
        long result = miSistema.creaReserva(idHotel, cliente, fecha, dias);
        return String.valueOf(result);
    }

    @Override
    public String datoReserva(String codigo) {
        String result = miSistema.datoReserva(Long.valueOf(codigo));
        return result;
    }
}
