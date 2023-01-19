package profJava.lesson230116.serial.p2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class SerialEx1P2 {
    public static void main(String[] args) {
        List<String> employees;
        try(ObjectInputStream inputStream
                    = new ObjectInputStream(new FileInputStream("employee.bin"))){
            employees = (ArrayList) inputStream.readObject();
            System.out.println(employees);
            System.out.println("DONE!");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
