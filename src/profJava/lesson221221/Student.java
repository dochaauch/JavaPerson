package profJava.lesson221221;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Student {
    private String name = "456";

    private char sex;
    private int age = 4;
    private int course;
    private double avgGrade;
}
