package profJava.lesson230111.fileReader;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) {
        String s = "In a wide-ranging interview with Stephen Colbert\n" +
                " on The Late Show - the first conducted after details\n" +
                " from the book were published - Harry suggested there had\n" +
                " been attempts to undermine his book, spoke of his fractured\n" +
                " relationship with his brother, and attacked the \"bigoted\" British press.\n";
        String q = "*****";

        FileWriter writer = null;
        try {
            writer = new FileWriter("/Users/docha/IdeaProjects/Person/src/profJava/lesson230111/british.txt", true);
            for (int i = 0; i < s.length(); i++) {
                writer.write(s.charAt(i));
            }
            writer.write(q);
            System.out.println("Done!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
