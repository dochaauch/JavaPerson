package profJava.lesson230125.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import profJava.lesson230125.ex.Ex1;

class Ex1Test {

    @Test
    void sumPositiveNumbers() {
        int a = 5;
        int b = 10;
        int expected = a + b;
        Assertions.assertEquals(expected, Ex1.sum(a, b));
    }
}