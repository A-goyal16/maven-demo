package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    private MathUtils math;

    @BeforeEach
    void setUp() {
        math = new MathUtils();
    }

    @Test
    void testAdd() {
        assertEquals(5, math.add(2, 3));
        assertEquals(0, math.add(-1, 1));
        assertEquals(-5, math.add(-2, -3));
    }

    @Test
    void testSubtract() {
        assertEquals(1, math.subtract(3, 2));
        assertEquals(-4, math.subtract(-2, 2));
    }

    @Test
    void testMultiply() {
        assertEquals(6, math.multiply(2, 3));
        assertEquals(0, math.multiply(5, 0));
        assertEquals(-6, math.multiply(-2, 3));
    }

    @Test
    void testDivide() {
        assertEquals(2.0, math.divide(6, 3), 0.001);
        assertEquals(2.5, math.divide(5, 2), 0.001);
    }

    @Test
    void testDivide_byZero_throwsException() {
        assertThrows(ArithmeticException.class, () -> math.divide(5, 0));
    }

    @Test
    void testIsEven() {
        assertTrue(math.isEven(4));
        assertFalse(math.isEven(3));
        assertTrue(math.isEven(0));
    }
}
