package profJava.cons221125;

public class Main {
    private static void printEmployee() {
        Office office = Office.getOffice();//убрали из параметра, чтобы не писать. в мэйн тоже проверяем singletone
        for (Employee e : office) {
            System.out.println(
                    String.format("Employee name: %s, family name: %s, year: %d, expir: %f, salary: %d, pos: %s",
                            e.getName(), e.getSecondName(), e.getYearStarted(), e.getExperience(), e.getSalaryEuro(), e.getEType())
            );
        }
        System.out.println("x".repeat(25));
    }

    public static void main(String[] args) {
        //Office office = new Office(); // ошибка,потому что конструктор приватный
        Office office = Office.getOffice();

        Employee e1 = new Employee("Ivan", "Sun", 100,  2010, 5.0, EmployeeType.FULL_TIME);
        Employee e2 = new Employee("Petr", "Polski", 200, 2009, 10.0, EmployeeType.PART_TIME);
        office.addEmployee(e1);
        office.addEmployee(e2);

        office.addEmployee(// можно без объявления новой переменной
                new Employee("Oksana", "Bereznaya",  150, 2002, 1.0, EmployeeType.REMOTE));

        office.addEmployee(// можно без объявления новой переменной
                new Employee("Anna", "Bereznaya",  150, 2002, 12.0, EmployeeType.REMOTE));

        System.out.println("Print");
        printEmployee();//убрали офис из параметров, чтобы не повторять все время

        System.out.println("Sort by name and position");
        office.sortByPosAndName();
        printEmployee();

        boolean res = office.removeEmployee("Ivan", "Sun");//распечатываем  результат
        System.out.println(String.format("employee war removed: %b", res));

        printEmployee();

        System.out.println("Sort by exp");
        office.sortByExp();
        printEmployee();

        System.out.println("Sort by salary");
        office.sortBySalary();
        printEmployee();
    }
}
