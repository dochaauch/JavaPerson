package profJava.lesson230125.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParamTest {
    @Test
    @RepeatedTest(name="Repeated test", value = 5)
    void testRepeated(){
        System.out.println("repeated");
    }

    @Test
    @Disabled
    void testLength(){
        Assertions.assertTrue("qwerty".length()>0);
        Assertions.assertTrue("123".length()>2);
        Assertions.assertTrue("1".length()>0);
        Assertions.assertTrue("lösklknköasd".length()>5);
    }

    @ParameterizedTest
    @ValueSource(strings = {"qwwerty", "123", "1", "lösklknköasd"})
    void testLengthParam(String arg){
        Assertions.assertTrue(arg.length()>1);
    }

    @ParameterizedTest
    @CsvSource(value = {"QWERTY,qwerty", "ASDF,^asdf"})
    void testLengthParamCsv(String arg, String lowered){
        Assertions.assertEquals(lowered, arg.toLowerCase());
    }

}

