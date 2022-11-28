package profJava.bigProjectMikh.Employee.bd;

import profJava.bigProjectMikh.Employee.model.EmployeeNameComparator;
import profJava.bigProjectMikh.Employee.model.Employees;
import profJava.bigProjectMikh.Employee.model.EmployeesIterator;
import profJava.cons221125.Office;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataBase implements Iterable<Employees> {
    List<Employees> employeesList = new ArrayList<>();

    public void addEmp(Employees employees) {
        this.employeesList.add(employees);
    }

    public int getSizeEmpList() {
        return employeesList.size();
    }

    public void clearEmpList() {
        this.employeesList.clear();
    }

    public int getIndex(Employees employees){
        return employeesList.indexOf(employees);
    }

    public void removeEmp(Employees employees) {
        this.employeesList.remove(getIndex(employees));
    }

    public void changeEmpWithAnother(Employees employees1, Employees employees2){
        this.employeesList.set(getIndex(employees1), employees2);
    }

    public void sortByName(){//логика как бы не относится к офису
        employeesList.sort(new EmployeeNameComparator());
    }

    @Override
    public Iterator<Employees> iterator() {
        return new EmployeesIterator(employeesList);
    }


}
