package Classes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Theatre {

    private String name;
    private Set<Seat> seats = new HashSet<>();
    private Integer rows;
    private Integer num_seats;

    /**
     * Method that allows to reserve a seat in the theater
     * @param seat string name e.g "A4", "B9"
     * @param price float price e.g 50.0, 13.99
     * @return string message with information about the reservation
     */
    public String reserve(String seat, Float price){

        if(!this.isSeatValid(seat)){
            return "Seat not valid.";
        }
        Seat seat1 = new Seat(seat, price);
        if( isBooked(seat1) ){
            return "Seat already booked.";
        }
        this.seats.add(seat1);
        return "Seat "+ seat +" booked.";
    }

    /**
     * Method that allows to validate if a name for a seat is correct
     * @param seat string name e.g "A4", "B9"
     * @return true if name is valid and not null, false otherwise
     */
    private boolean isSeatValid(String seat){
        return seat != null && Pattern.matches("^[A-H]{1}[1-9]{1}$", seat.toUpperCase());
    }

    /**
     * Method that allows to know if a seat is already booked
     * @param seat string name e.g "A4", "B9"
     * @return true if seat is already booked, false otherwise
     */
    private boolean isBooked(Seat seat){
        return this.seats.contains(seat);
    }

    /**
     * Method that allows to cancel a booked seat
     * @param seat string name e.g "A4", "B9"
     * @return string message with status about the cancelation
     */
    public String cancel(String seat){
        if(!this.isSeatValid(seat)){
            return "Seat not valid.";
        }

        if( !this.seats.remove( new Seat(seat) ) ){
            return "Seat "+ seat + " isn't booked.";
        }

        return "Seat "+ seat + " was cancel correctly.";

    }

    /**
     * Method that allows to pring a small diagram about the seats already booked
     * and information about availability
     */
    public String print(){
        final String seats_letters = "ABCDEFGH";
        String result = "";

        for( int i = 0 ; i < this.rows ; i ++ ){
            String letter = String.valueOf( seats_letters.charAt(i) );
            for(int j = 0 ; j <= this.num_seats ; j++){
                Seat intermediate = new Seat(letter+j);
                Seat seat_aux = this.seats.stream().filter(seat -> seat.equals(intermediate) ).findFirst().orElse(null);

                if( seat_aux != null ){
                    result += seat_aux.getName();
                    result += (j <= this.num_seats -1) ? " " : "\n";
                    continue;
                }
                result += ".";

                result += (j <= this.num_seats -1) ? " " : "\n";
            }
        }
        result += "\nTotal of seats: " + (this.num_seats * this.rows);
        result += "\nTotal of seats booked: " + (this.seats.size());
        result += "\nTotal of seats free: " + (this.num_seats * this.rows - this.seats.size());

        return result;

    }

}
