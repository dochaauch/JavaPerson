package profJava.cons221125;

import java.sql.SQLOutput;

public class Main {
    private static void printEmployee() {
        Office office = Office.getOffice();//убрали из параметра, чтобы не писать. в мэйн тоже проверяем singletone
        for (Employee e : office) {
            System.out.println(
                    String.format("Employee name: %s, family name: %s, year: %d, expir: %f, salary: %d",
                            e.getName(), e.getSecondName(), e.getYear(), e.getExperience(), e.getSalaryEuro())
            );
        }
    }

    public static void main(String[] args) {
        //Office office = new Office(); // ошибка,потому что конструктор приватный
        Office office = Office.getOffice();

        Employee e1 = new Employee("Ivan", "Sun", 100,  2010, 5.0, EmployeeType.FULL_TIME);
        Employee e2 = new Employee("Petr", "Polski", 200, 2009, 10.0, EmployeeType.PART_TIME);
        office.addEmployee(e1);
        office.addEmployee(e2);

        office.addEmployee(// можно без объявления новой переменной
                new Employee("Anna", "Bereznaya",  150, 2002, 12.0, EmployeeType.REMOTE));

        printEmployee();//убрали офис из параметров, чтобы не повторять все время

        boolean res = office.removeEmployee("Ivan", "Sun");//распечатываем  результат
        System.out.println(String.format("employee war removed: %b", res));

        printEmployee();

        office.sortByExp();
        printEmployee();

        office.sortBySalary();
        printEmployee();

    }
}
