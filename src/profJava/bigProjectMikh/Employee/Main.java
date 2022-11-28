package profJava.bigProjectMikh.Employee;

import profJava.bigProjectMikh.Employee.bd.DataBase;
import profJava.bigProjectMikh.Employee.model.*;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        DataBase db = new DataBase();

        db.addEmp(new Top("Andrei", "Andreev", 4500.00));
        db.addEmp(new Middle("Kristina", "Skara", 3500.00));
        db.addEmp(new Ordinary("Igor", "Skara", 2500.00));
        db.addEmp(new Ordinary("Anna", "Skara", 2000.00));
        db.addEmp(new Ordinary("Marina", "Merci", 3000.00));

        printDb(db);
        db.sortByName();
        printDb(db);
    }

    private static void printDb(DataBase db) {
        for (Employees e: db) {
            System.out.println(e);
        }
        System.out.println("______");
    }
}
