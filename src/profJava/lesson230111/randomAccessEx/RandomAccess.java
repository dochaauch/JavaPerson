package profJava.lesson230111.randomAccessEx;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccess {
    public static void main(String[] args) {
        try(RandomAccessFile file =  new RandomAccessFile("british.txt", "rw")){
//            int a = file.read();
//            System.out.println((char) a);
//
//            String s = file.readLine();
//            System.out.println(s);
//
//            file.seek(111);
//            String w = file.readLine();
//            System.out.println(w);
//
//            long position = file.getFilePointer();
//            System.out.println(position);
//
//            file.seek(0);
//            file.writeBytes("!!!");

            file.seek(file.length()-1);
            file.writeBytes("\n\t\t\t\tBBC NEWS");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
