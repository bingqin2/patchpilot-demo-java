package demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void should_add_numbers() {
        assertEquals(3, calculator.add(1, 2));
    }

    @Test
    void should_subtract_numbers() {
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    void should_multiply_numbers() {
        assertEquals(12, calculator.multiply(3, 4));
    }

    @Test
    void should_divide_numbers() {
        assertEquals(4, calculator.divide(12, 3));
    }

    @Test
    void should_reject_division_by_zero_with_a_clear_message() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> calculator.divide(1, 0)
        );
        assertEquals("divisor must not be zero", exception.getMessage());
    }
}
