package lab14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MultiplicationTest {

    @Test
    public void testMultiply() {
        Multiplication multiplication = new Multiplication();
        assertEquals(20, multiplication.multiply(4, 5));
    }

    @Test
    public void testMultiplyWithZero() {
        Multiplication multiplication = new Multiplication();
        assertEquals(0, multiplication.multiply(0, 5));
        assertEquals(0, multiplication.multiply(4, 0));
    }

    @Test
    public void testMultiplyWithNegativeNumbers() {
        Multiplication multiplication = new Multiplication();
        assertEquals(-20, multiplication.multiply(-4, 5));
        assertEquals(-20, multiplication.multiply(4, -5));
        assertEquals(20, multiplication.multiply(-4, -5));
    }
}