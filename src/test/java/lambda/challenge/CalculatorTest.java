package lambda.challenge;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CalculatorTest {

    Calculator calculator;

    @BeforeAll
    public void init(){
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Test add function")
    void addOperationTest() {
        assertEquals(12, calculator.add(5,7));
    }

    @Test
    @DisplayName("Test substraction method")
    void substractionOperationTest(){
        assertEquals(1, calculator.sub(5,4));
    }

    @ParameterizedTest
    @DisplayName("Test odd method, verify are odd")
    @ValueSource(ints = {3,5,7,9,11})
    void TestNumbersMustBeOdd(Integer num){
        assertEquals(true, calculator.isOdd(num));
    }

    @ParameterizedTest
    @DisplayName("Test odd method, verify aren't odd")
    @ValueSource(ints = {2,4,6,8,10,12})
    void TestNumbersArentOdd(Integer num){
        assertEquals(false, calculator.isOdd(num));
    }

    @ParameterizedTest
    @DisplayName("Test prime function, verify there are prime")
    @ValueSource(ints = {2,3,5,7,11,97})
    void TestNumberMustBePrime(int num){
        assertEquals(true, calculator.isPrime(num));
    }

    @ParameterizedTest
    @DisplayName("Test prime function, verify there aren't prime")
    @ValueSource(ints = {4,6,8,20,100})
    void TestNumbersArentPrime(int num){
        assertEquals(false, calculator.isPrime(num));
    }

    @Test
    @DisplayName("Test factorial function")
    void factorialOperationTest(){
        assertEquals(120, calculator.factorial(5));
    }

}