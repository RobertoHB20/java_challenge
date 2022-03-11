import Classes.Theatre;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Challenge {

    public static void main(String[] args) {

        List<String> seats = new ArrayList<>(Arrays.asList( "a3", "A4", "A7", "D3" , "D4", "D5", "C7", "B4", "H7"));
        Theatre theatre = new Theatre();

        seats.forEach( seat -> theatre.reserve(seat, 50f));
        theatre.setRows(8);
        theatre.setNum_seats(8);

        System.out.println(theatre.print());


    }
}
