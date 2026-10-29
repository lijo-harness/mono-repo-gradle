
package com.example.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void shouldAddTwoNumbers() {
        assertEquals(15, calculator.add(10, 5));
    }

    @Test
    void shouldSubtractTwoNumbers() {
        assertEquals(5, calculator.subtract(10, 5));
    }

    @Test
    void shouldMultiplyTwoNumbers() {
        assertEquals(50, calculator.multiply(10, 5));
    }

    @Test
    void shouldDivideTwoNumbers() {
        assertEquals(4, calculator.divide(20, 5));
    }

    @Test
    void shouldThrowExceptionWhenDividingByZero() {
        assertThrows(
            IllegalArgumentException.class,
            () -> calculator.divide(10, 0)
        );
    }

    @Test
    void shouldIdentifyEvenNumbers() {
        assertTrue(calculator.isEven(10));
        assertFalse(calculator.isEven(7));
    }
}
