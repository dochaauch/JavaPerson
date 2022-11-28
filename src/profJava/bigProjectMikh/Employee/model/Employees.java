package profJava.bigProjectMikh.Employee.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/*Сделать проект для Сотрудников компании.
Должен быть класс Сотрудники, ЭНАМЫ с градацией должностей.
Интерфейсы с фичами для каждого уровня должности.
Наследники от главного класса будут ТОПы, Среднего звена, Рядовые сотрудники.
Хранить сотрудников в папке model.
Далее сделать класс базаДанных по аналогии с уроком.
Хранить класс в папке bd.
Сделать класс Сервис, который будет выполнять разного рода опреации, напрмер смены должности итд.
Хранить Сервисы в папке service*/

@Getter
@Setter
@ToString
public class Employees {
    private String name;
    private String familyname;
    private UUID id;
    private double salary;
    private Position position;
    List<Employees> employeesList;

    public Employees(String name, String familyname, double salary) {
        this.name = name;
        this.familyname = familyname;
        this.id = UUID.randomUUID();
        this.salary = salary;
    }

}

