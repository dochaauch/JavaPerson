package profJava.lesson230111.fileReader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) throws IOException {
//        FileReader fileReader = null;
//        try {
//            fileReader = new FileReader("prog.txt");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } finally {
//            fileReader.close();
//        }
        try (FileReader fileReader = new FileReader("prog.txt")){
            int characters;

            while ((characters = fileReader.read()) != -1) {
                System.out.print((char) characters);
            }
            System.out.println("\nDONE!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
