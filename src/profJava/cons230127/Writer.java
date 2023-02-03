package profJava.cons230127;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    private BufferedWriter bw;

    public Writer(String path) {
        try {
            this.bw = new BufferedWriter(new FileWriter(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void write(String s) {
        try {
            bw.write(s);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void close() {
        try {
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
