package profJava.task230125.test;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import profJava.task230125.Calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calc;

    @BeforeAll
    static void globalInit() {
        System.out.println("GLOBAL");
    }

   @BeforeEach
    void init(){
       System.out.println("Init calculator");
       calc = new Calculator();
    }

    @Test
    void add() {
        int first = 10;
        int second = 14;
        int expected = 24;
        int actual = calc.add(first, second);
        assertAll(
                () -> assertEquals(expected, actual),
                () -> assertEquals(10, calc.add(5, 6)),
                () -> assertEquals(11, calc.add(5, 6)),
                () -> assertEquals(2, calc.add(5, 6)),
                () -> assertEquals(10, calc.add(5, 5))
        );
    }

    @ParameterizedTest
    @CsvSource({
            "1,2,3",
            "2,2,4",
            "3,2,5",
            "4,2,6",
            "5,2,7"
    })
    void paramTestOne(int a, int b, int res) {
        assertEquals(res, calc.add(a, b));
    }

    @ParameterizedTest
    @CsvFileSource(files ={ "test-data/1", "test-data/2.csv"})
    void paramTestTwo(int a, int b, int res) {
        assertEquals(res, calc.add(a, b));
    }

    @MethodSource(value = "addTestGenerator")
    @ParameterizedTest
    void paramTestThree(int a, int b, int res) {
        assertEquals(res, calc.add(a, b));
    }

    static Stream<Arguments> addTestGenerator(){
       List<Arguments> args = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            int a = (int) (Math.random() * 1000);
            int b = (int) (Math.random() * 1000);
            int res = a + b;
            args.add(Arguments.of(a,b, res));
        }
        return args.stream();
    }

    @Test
    void sub() {
       assertEquals(4, calc.sub(14, 10));
    }

    @Test
    void mul() {
       assertEquals(140,calc.mul(14, 10));
    }

    @Test
    void div() {
       assertEquals(2, calc.div(28,14));
    }

    @Test
    void divByZero_expectedArithmeticException() {
        //assertEquals(2, calc.div(28,0));
        assertThrows(
                ArithmeticException.class,
                () -> calc.div(10, 0),
                "/ by zero111"
                );
    }

    @AfterEach
    void destroy(){
        System.out.println("Dispose");
    }

    @AfterAll
    static void globalDispose(){
        System.out.println("Global dispose");
    }
}