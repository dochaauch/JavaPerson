package profJava.task221114;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.LocalDateTime;

import static java.time.temporal.ChronoUnit.DAYS;

public class Main {
    public static void main(String[] args) {
        //employeeExamplpe();

        Animal[] animals = {
                new Bird("Chizik"),
                new Cat("Barsik"),
                new Dog("Bobik"),
                new Snake("Kaa")
        };

        for (Animal animal : animals) {
            animal.voice();
            animal.walk();
//            if(animal instanceof Bird ) {
//                ((Bird) animal).fly();
//            }
            if(animal instanceof Bird bird) {
                bird.fly();
            }
        }
    }

    private static void employeeExamplpe() {
        var employee = new Employee("vasja", "manager", 21.23, 30, LocalDate.parse("2022-10-01"));
        employee.setSalary(employee.getSalary() * 100);
        employee.setPosition("chief");
        System.out.println(employee.toString());

        var someDate = LocalDate.of(2022,10,10);
        LocalDateTime localDateTime = LocalDateTime.of(2022, 10, 24, 15, 45);
        System.out.printf("Vasja emp date  is before some date ? >> %b%n", employee.getEmploymentDate().isBefore(someDate));
        System.out.printf("Time between date is %s%n", DAYS.between(employee.getEmploymentDate(), someDate));

        BigDecimal bd = new BigDecimal("100500.23344553");
        bd.multiply(BigDecimal.valueOf(10), new MathContext(4, RoundingMode.HALF_DOWN));
    }
}
