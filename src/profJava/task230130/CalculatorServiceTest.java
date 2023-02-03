package profJava.task230130;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import profJava.task230125.Calculator;

import java.util.ArrayList;


@ExtendWith(MockitoExtension.class)
class CalculatorServiceTest {

    @Spy
    ArrayList<String> list;

    @Test
    void add() {
        Calculator calculator = Mockito.mock(Calculator.class);
    }

    @Test
    void arrayList(){
        list.add("1");
        Assertions.assertEquals(1, list.size());
        Assertions.assertEquals("1", list.get(0));

    }

    @Test
    void sub() {
    }

    @Test
    void mul() {
    }

    @Test
    void div() {
    }
}