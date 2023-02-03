package profJava.cons230127.test;

import org.junit.jupiter.api.Test;
import profJava.cons230127.Reader;
import profJava.cons230127.Writer;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WriterTest {

    @Test
    void write() {
        String path = "./src/profJava/cons230127/test/testfile_sorted.txt";
        Writer writer = new Writer(path);
        String line1 = "Line: 1 ; SEven: 6 ; AOdd: 2 ; Max: 5 ; Min: 1";
        String line2 = "Line: 2 ; SEven: 20 ; AOdd: 7 ; Max: 10 ; Min: 6";
        writer.write(line1+'\n');
        writer.write(line2);
        writer.close();
        List<String> writtenLines = Reader.readFromFile("./src/profJava/cons230127/test/testfile_sorted.txt");
        assertEquals(2, writtenLines.size());
        assertEquals("Line: 1 ; SEven: 6 ; AOdd: 2 ; Max: 5 ; Min: 1", writtenLines.get(0));
        assertEquals("Line: 2 ; SEven: 20 ; AOdd: 7 ; Max: 10 ; Min: 6", writtenLines.get(1));
    }
}