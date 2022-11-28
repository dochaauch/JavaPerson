package profJava.bigProjectMikh.Employee.model;

public class Middle extends Employees {
    public Middle(String name, String familyname, double salary) {
        super(name, familyname, salary);
        this.setPosition(Position.MIDDLE);
    }
}
