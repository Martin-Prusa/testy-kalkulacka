package cz.company.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicTest {
    private Logic l = new Logic();

    @Test
    void plus() {
        assertEquals(5.5, l.plus(5d, 0.5));
    }

    @Test
    void minus() {
        assertEquals(4.5, l.minus(5d, 0.5));
    }

    @Test
    void times() {
        assertEquals(6, l.times(2, 3));
    }

    @Test
    void divided() {
        assertEquals(20, l.divided(100, 5));
    }

    @Test
    void power() {
        assertEquals(8, l.power(2,3));
    }

    @Test
    void factorial() {
        assertEquals(120, l.factorial(5));
    }
}