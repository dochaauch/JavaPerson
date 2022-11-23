package basicJava.lesson221107;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {
    Calc calc = new Calc();

    @Test
    void plus() {
        assertEquals(10, calc.plus(5, 5));
    }

    @Test
    void getSmth() {
    }
}