package profJava.task221114;

import java.time.LocalDate;
import java.time.Year;

public class Employee {
    private String name;
    private String position;
    private double salary;
    private int age;
    LocalDate employmentDate;
    private int bornYear;

    public Employee(String name, String position, double salary, int age, LocalDate employmentDate) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        //this.age = age;
        this.bornYear = Year.now().getValue() - age;
        this.employmentDate = employmentDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return Year.now().getValue() - bornYear;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(LocalDate employmentDate) {
        this.employmentDate = employmentDate;
    }

    @Override
    public String toString() {
        return String.format("Employee: name=%s, position=%s, salary=%f, age=%d, employmentDate=%s",
                name, position, salary,  getAge(), employmentDate);
    }
}
