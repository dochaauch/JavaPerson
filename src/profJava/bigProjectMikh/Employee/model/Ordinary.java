package profJava.bigProjectMikh.Employee.model;

public class Ordinary extends Employees {
    public Ordinary(String name, String familyname, double salary) {
        super(name, familyname, salary);
        this.setPosition(Position.ORDINARY);
    }
}
