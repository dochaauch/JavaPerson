package profJava.lesson230116.serial.p1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerialEx1P1 {
    public static void main(String[] args) {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> employees = new ArrayList<>();
        employees.add("Alexander");
        employees.add("Oxana");
        employees.add("Jelena");
        employees.add("Anatoli");

        try(ObjectOutputStream outputStream
                    = new ObjectOutputStream(new FileOutputStream("employee.bin"))){
            outputStream.writeObject(employees);
            System.out.println("DONE!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
