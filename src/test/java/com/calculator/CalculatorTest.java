package com.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(8, calculator.add(5, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(15, calculator.multiply(5, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(1.6667, calculator.divide(5, 3), 0.0001);
    }

    @Test
    public void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calculator.divide(5, 0));
        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }
}