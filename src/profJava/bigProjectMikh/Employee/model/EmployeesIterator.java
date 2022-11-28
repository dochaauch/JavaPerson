package profJava.bigProjectMikh.Employee.model;

import profJava.cons221125.Employee;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class EmployeesIterator implements Iterator<Employees> {
    int idx = 0;
    List<Employees> employeesList;

    public EmployeesIterator(List<Employees> employeesList){//конструктор
        this.employeesList = employeesList;
    }

    @Override
    public boolean hasNext() {
        return idx < employeesList.size();
    }

    @Override
    public Employees next() {
        if(!hasNext())  // пишем без скобок, просто выделением
            throw new NoSuchElementException();
        return employeesList.get(idx++);
    }
}
