package profJava.bigProjectMikh.Employee.model;

import profJava.cons221125.Office;

import java.util.Iterator;

public class Top extends Employees {
    public Top(String name, String familyname, double salary) {
        super(name, familyname, salary);
        this.setPosition(Position.TOP);
    }

}
