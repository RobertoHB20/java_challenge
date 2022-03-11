package Classes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Seat {

    private Integer line;
    private String row;
    private Float price;

    /**
     * Constructor that allows to generate a new Seat using its string name and a price for that seat
     * @param seat_name string name e.g "A4", "B9"
     * @param price float price e.g 50.0, 13.99
     */
    public Seat(String seat_name, Float price){
        this.row = seat_name.substring(0,1).toUpperCase();
        this.line = Integer.valueOf( seat_name.substring(1) );
        this.price = price;
    }

    /**
     * Constructor that allows to generate a new Seat only by a string name
     * @param seat_name string name e.g "A4", "B9"
     */
    public Seat(String seat_name){
        this.row = seat_name.substring(0,1);
        this.line = Integer.valueOf( seat_name.substring(1) );
        this.price = null;
    }

    public String getName(){
        return "[" + row + line + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Seat)) return false;
        Seat seat = (Seat) o;
        return getLine().equals(seat.getLine()) && getRow().equals(seat.getRow()) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLine(), getRow());
    }
}
