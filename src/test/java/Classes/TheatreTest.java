package Classes;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class TheatreTest {

    static Theatre theatre;
    final float COST = 50f;

    @BeforeAll
    public static void setup(){
        theatre = new Theatre();
    }


    @Order(1)
    @ParameterizedTest
    @DisplayName("Test to validate that a valid seat can be booked")
    @ValueSource(strings = { "a3", "A4", "A7", "D3" , "D4", "D5", "C7", "B4", "H7"})
    void ReserveAValidSeat(String seat) {
        assertEquals("Seat "+ seat +" booked.", theatre.reserve(seat,COST) );
    }

    @Order(2)
    @ParameterizedTest
    @DisplayName("Test that method doesn't allow to insert a repeated seat")
    @ValueSource(strings = { "a3", "A4", "A7", "D3" , "D4", "D5", "C7", "B4", "H7"})
    void TestNotAllowToAddRepeatedSeat(String seat){

        assertEquals( "Seat already booked." , theatre.reserve(seat,COST) );
    }

    @Order(3)
    @ParameterizedTest
    @DisplayName("Test to validate if a seat has an allowed name")
    @ValueSource(strings = { "a0", "A400", "X7", "" , "00", "AA", "J4"})
    void VerifySeatsAreValid(String seat){

        assertEquals( "Seat not valid." , theatre.reserve(seat,COST) );
    }

    @Order(4)
    @ParameterizedTest
    @DisplayName("Test that allows to cancel an existing seat")
    @ValueSource(strings = { "A4"})
    void CancelASeatBooked(String seat) {
        assertEquals( "Seat "+ seat + " was cancel correctly.", theatre.cancel(seat) );
    }

    @Order(5)
    @ParameterizedTest
    @DisplayName("Test that cancel method does not allow to cancel a bad spelled seat")
    @ValueSource(strings = { "a0", "A400", "X7", "" , "00", "AA", "J4"})
    void VerifySeatNameAreValidToCancel(String seat){

        assertEquals( "Seat not valid." , theatre.cancel(seat) );
    }

    @Order(6)
    @ParameterizedTest
    @DisplayName("Test that cancel method does not allow to cancel a not booked seat")
    @ValueSource(strings = { "A1", "A2", "A5", "D1" , "D2", "D9"})
    void VerifySeatIsBookedToCancel(String seat){

        assertEquals( "Seat "+ seat + " isn't booked." , theatre.cancel(seat) );
    }

    @AfterAll
    void print() {
        theatre.setName("Java Challenge");
        theatre.setNum_seats(8);
        theatre.setRows(8);
        String result = ". . . [A3] . . . [A7] .\n. . . . [B4] . . . .\n. . . . . . . [C7] .\n. . . [D3] [D4] [D5] . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . [H7] .\n\nTotal of seats: 64\nTotal of seats booked: 8\nTotal of seats free: 56";
        assertEquals( result,theatre.print());

    }
}