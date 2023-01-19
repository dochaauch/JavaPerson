package profJava.lesson230116.serial.emp;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;

@AllArgsConstructor
@ToString
public class Employee implements Serializable {
    @Serial
    private static final long serialVersionUID = 6;

    String name;
    String department;
    int age;
    transient double salary;
    //Car car;
}
