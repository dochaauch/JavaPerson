package profJava.lesson230116.serial.emp;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@AllArgsConstructor
@ToString

public class Car implements Serializable {
    String model;
    String colour;
}
