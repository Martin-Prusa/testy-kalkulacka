package cz.company.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicTest {
    private Logic l = new Logic();

    @Test
    void plus() {
        assertEquals(5.5, l.plus(5d, 0.5));
        assertNotEquals(0, l.plus(3, 2));
    }

    @Test
    void minus() {
        assertEquals(4.5, l.minus(5d, 0.5));
        assertNotEquals(0, l.minus(3, 2));

    }

    @Test
    void times() {
        assertEquals(6, l.times(2, 3));
        assertNotEquals(0, l.times(3, 2));

    }

    @Test
    void divided() {
        assertEquals(20, l.divided(100, 5));
        assertNotEquals(0, l.divided(3, 2));
    }

    @Test
    void power() {
        assertEquals(8, l.power(2,3));
        assertNotEquals(0, l.power(3, 2));

    }

    @Test
    void factorial() {
        assertEquals(120, l.factorial(5));
        assertNotEquals(0, l.factorial(3));

    }
}