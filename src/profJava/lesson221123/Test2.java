package profJava.lesson221123;

import profJava.lesson221123.employee.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee em1 = new Employee(12, "Konstantin", "Java DEV", 500);
        Employee em2 = new Employee(21, "Oksana", "Java DEV", 1500);
        Employee em3 = new Employee(13, "Elina", "Java DEV", 900);
        Employee em4 = new Employee(4, "Svitlana", "Java DEV", 2500);

        employeeList.add(em1);
        employeeList.add(em2);
        employeeList.add(em3);
        employeeList.add(em4);

        //em3.compareTo(em1);
        //Arrays.sort(new Employee[] {em1, em2, em3, em4});

        System.out.println(employeeList);
        Collections.sort(employeeList, new IdComparator());
        System.out.println(employeeList);
    }
}
