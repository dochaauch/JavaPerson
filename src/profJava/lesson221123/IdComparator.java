package profJava.lesson221123;

import profJava.lesson221123.employee.Employee;

import java.util.Comparator;

public class IdComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {
        if(emp1.getId() == emp2.getId()){
            return 0;
        } else if (emp1.getId() < emp2.getId()) {
        return -1;} else {
            return 1;
        }
    }
}

class NameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.getName().compareTo(emp2.getName());
    }
}

class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.getSalary()-emp2.getSalary();
    }
}