package module04;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MethodExercisesTest {

    @Test
    void testExercise1_checkEven() {
        assertTrue(MethodExercises.exercise1_checkEven(4));
        assertFalse(MethodExercises.exercise1_checkEven(7));
        assertTrue(MethodExercises.exercise1_checkEven(0));
    }

    @Test
    void testExercise2_greetUser() {
        assertEquals("Hello, Alice!", MethodExercises.exercise2_greetUser("Alice"));
        assertEquals("Hello, !", MethodExercises.exercise2_greetUser(""));
    }

    @Test
    void testExercise3_calculateSum() {
        assertEquals(8, MethodExercises.exercise3_calculateSum(5, 3));
        assertEquals(0, MethodExercises.exercise3_calculateSum(0, 0));
        assertEquals(-1, MethodExercises.exercise3_calculateSum(2, -3));
    }

    @Test
    void testExercise4_findMax() {
        assertEquals(20, MethodExercises.exercise4_findMax(10, 20));
        assertEquals(5, MethodExercises.exercise4_findMax(5, 3));
        assertEquals(4, MethodExercises.exercise4_findMax(4, 4));
    }

    @Test
    void testExercise5_isPrime() {
        assertTrue(MethodExercises.exercise5_isPrime(11));
        assertFalse(MethodExercises.exercise5_isPrime(4));
        assertFalse(MethodExercises.exercise5_isPrime(1));
        assertFalse(MethodExercises.exercise5_isPrime(0));
    }
}