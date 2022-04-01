package Patterns.Structural.Adapter.Excercise;

import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Random;

@NoArgsConstructor
public class ReservaCVImpl implements ReservaCV{

    private String idHotel;
    private String cliente;
    private Date fecha;
    private int dias;
    private long codigo;

    private ReservaCVImpl(String idHotel, String cliente, Date fecha, int dias) {
        this.idHotel = idHotel;
        this.cliente = cliente;
        this.fecha = fecha;
        this.dias = dias;
    }



    @Override
    public String hotelInfo(String idHotel) {
        return "Hotel: " + idHotel ;
    }

    @Override
    public long creaReserva(String idHotel, String cliente, Date fecha, int dias) {

        this.idHotel = idHotel;
        this.cliente = cliente;
        this.fecha = fecha;
        this.dias = dias;

        this.codigo = Math.abs(new Random().nextLong());

        return codigo;
    }

    @Override
    public String datoReserva(long codigo) {
        this.codigo = codigo;
        return this.toString();
    }

    @Override
    public String toString() {
        return "Reservation info: {" +
                " Hotel:'" + idHotel + '\'' +
                ", cliente:'" + cliente + '\'' +
                ", fecha:" + fecha +
                ", dias:" + dias +
                ", codigo:" + codigo +
                '}';
    }
}
