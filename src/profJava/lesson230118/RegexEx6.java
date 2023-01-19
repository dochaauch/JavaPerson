package profJava.lesson230118;

import lombok.AllArgsConstructor;

public class RegexEx6 {
    static void getInfo(Employee emp) {
        System.out.printf("ID:%03d\t Name: %-12s\t Surname: %-12s\t %,.1f\n",
                emp.id, emp.name, emp.surname, emp.salary * (emp.bonusPCT +1));
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Alexander", "A", 2500, 1.2d);
        Employee e2 = new Employee(2, "Giorgi", "B", 800, 1.3d);
        Employee e3 = new Employee(3, "Jelena", "J", 3000, 1.1d);

        getInfo(e1);
        getInfo(e2);
        getInfo(e3);
    }

}

@AllArgsConstructor
class Employee {
    int id;
    String name;
    String surname;
    int salary;
    double bonusPCT;

}
