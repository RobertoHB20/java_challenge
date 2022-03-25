package lambda.challenge;

import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Calculator {


    /**
     * Method that allow to perform an addition of two numbers
     * @param num1  integer number
     * @param num2  integer number
     * @return  sum of two numbers
     */
    public int add(int num1, int num2){
        BiFunction<Integer, Integer, Integer> suma = (n, m) -> n + m;
        return suma.apply(num1, num2);
    }

    /**
     * Method that allow to perform a substractio of two numbers
     * @param num1 integer number
     * @param num2 integer number
     * @return  result of num1 - num2
     */
    public int sub(int num1, int num2){
        BiFunction<Integer, Integer, Integer> resta = (n, m)-> n-m;
        return resta.apply(num1, num2);
    }

    /**
     * Method to know if a number is odd
     * @param num number to test
     * @return  boolean true if is odd, false otherwise
     */
    public boolean isOdd(int num){
        Predicate<Integer> is_odd = (n) -> n % 2 != 0;
        boolean result = is_odd.test(num);
        return result;
    }

    /**
     * Method to know if a number is prime, that means it only can be divided by 1 and itself
     * @param num to test
     * @return  boolean true if is prime, false otherwise
     */
    public boolean isPrime(int num){
        if(num < 2){
            return false;
        }
        long result = IntStream.rangeClosed( 2, num - 1 ).mapToObj( e -> num % e == 0).filter( e -> e == true ).count();
        return result < 1;
    }

    /**
     * Method that allows to calculate the factorial of a number
     * @param num
     * @return integer
     */
    public int factorial(int num){
        if(num < 0){
            return 0;
        }
        if(num == 0){
            return 1;
        }
        int result = IntStream.rangeClosed(1,num).reduce( 1, (a,b) -> a * b );
        return result;
    }

}
