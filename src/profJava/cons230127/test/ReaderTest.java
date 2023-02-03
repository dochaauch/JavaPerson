package profJava.cons230127.test;

import org.junit.jupiter.api.Test;
import profJava.cons230127.Reader;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReaderTest {
    @Test
    void readFromFile() {
        List<String> listOfStrings = Reader.readFromFile("./src/profJava/cons230127/test/testReadFile.txt");
        assertEquals(3, listOfStrings.size());
        assertEquals("1 2 3 4 5", listOfStrings.get(0));
        assertEquals("6 7 8 9 10", listOfStrings.get(1));
        assertEquals("11 12 13 14 15", listOfStrings.get(2));
    }
}