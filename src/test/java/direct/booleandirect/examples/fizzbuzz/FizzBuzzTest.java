package direct.booleandirect.examples.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void printFizzBuzz() {
        var fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.printFizzBuzz(1));
        assertEquals("Fizz", fizzBuzz.printFizzBuzz(3));
        assertEquals("Buzz", fizzBuzz.printFizzBuzz(5));
        assertEquals("FizzBuzz", fizzBuzz.printFizzBuzz(15));
    }
}