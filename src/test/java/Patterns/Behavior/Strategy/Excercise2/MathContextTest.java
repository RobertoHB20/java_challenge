package Patterns.Behavior.Strategy.Excercise2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathContextTest {

    MathContext operation;

    @Test
    @DisplayName("Test subtract method strategy")
    public void TestSubtractMethod(){
        operation = new MathContext( new MathSubstract() );
        assertEquals( 5, operation.execute(10,5));
    }

    @Test
    @DisplayName("Test multiply method strategy")
    public void TestMultiplyMethod(){
        operation = new MathContext( new MathMultiply() );
        assertEquals( 25, operation.execute(5,5) );
    }

}