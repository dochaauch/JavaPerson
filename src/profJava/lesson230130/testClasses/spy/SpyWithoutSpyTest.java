package profJava.lesson230130.testClasses.spy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class SpyWithoutSpyTest {

    @Mock
    List<String> list;

    @Test
    void testMockReturnZero() {
        String s = "!!!";
        list.add(s);
        Mockito.verify(list).add(s);
        Assertions.assertEquals(0, list.size());
    }
}