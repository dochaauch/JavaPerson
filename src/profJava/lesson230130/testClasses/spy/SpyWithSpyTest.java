package profJava.lesson230130.testClasses.spy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;

@ExtendWith(MockitoExtension.class)
public class SpyWithSpyTest {
    @Spy
    //List<String> list = new ArrayList<>();
    ArrayList<String> list;

    @Test
    void testMockReturnZero() {
        String s = "!!!";
        list.add(s);
        Mockito.verify(list).add(s);
        Assertions.assertEquals(1, list.size());
    }
}
