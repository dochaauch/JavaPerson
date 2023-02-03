package profJava.task230130;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TddTest {

    @Test
    void greetingTest() {
        Greeter greeter = new Greeter();
        Assertions.assertEquals("Hello Alex!", greeter.greet("Alex"));
    }

    @Test
    void goodbyeTest() {
        Greeter greeter = new Greeter();
        Assertions.assertEquals("GoodBye Alex!", greeter.goodbye("Alex"));
    }
}
