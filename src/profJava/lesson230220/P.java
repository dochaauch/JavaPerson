package profJava.lesson230220;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class P {
    public int id;
    public String name;
    public String department;

    @Getter
    @Setter
    private double salary = 222.22;

    public P(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    private void changeDepartment(String newDepartment) {
        department = newDepartment;
        System.out.println("New department: " + department);
    }

    public void increaseSalary() {
        salary = salary * 1.25;
    }
}
