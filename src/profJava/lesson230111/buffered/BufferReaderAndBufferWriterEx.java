package profJava.lesson230111.buffered;

import java.io.*;

public class BufferReaderAndBufferWriterEx {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("british.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("britshBuff.txt")) )  {
//            int character;
//            while((character = reader.read()) != -1) {
//                writer.write(character);
//            }
            String line;
            while((line = reader.readLine()) != null) {
                writer.write(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
