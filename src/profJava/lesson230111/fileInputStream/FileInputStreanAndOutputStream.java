package profJava.lesson230111.fileInputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreanAndOutputStream {
    public static void main(String[] args) {
//        нельзя использовать этот вариант!
//        try (BufferedReader reader
//                     = new BufferedReader(new FileReader("img.png"));
//             BufferedWriter writer = new BufferedWriter(new FileWriter("newImp.png"))) {
//            int character;
//            while ((character = reader.read()) != -1) {
//                writer.write(character);
//            }
//        } catch(IOException e){
//                e.printStackTrace();
//            }
//        }

        try (FileInputStream inputStream = new FileInputStream("img.png");
             FileOutputStream outputStream = new FileOutputStream("impOutput.png")) {
            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }
            System.out.println("DONE!!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


