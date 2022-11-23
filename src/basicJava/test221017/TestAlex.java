package basicJava.test221017;

public class TestAlex {
    private int age;
    private String name;
    private String familyname;
    private int salary;
    private int tax;

    public TestAlex(int age, String name, String familyname, int salary, int tax) {
        this.age = age;
        this.name = name;
        this.familyname = familyname;
        this.salary = salary;
        this.tax = tax;
    }

    public TestAlex(String name, String familyname) {
        this.name = name;
        this.familyname = familyname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyname() {
        return familyname;
    }

    public void setFamilyname(String familyname) {
        this.familyname = familyname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public static void main(String[] args) {
        TestAlex person1 = new TestAlex("Alex", "Lusin");
        TestAlex person2 = new TestAlex(32, "Sergey", "Ivanov", 5000, 15);
    }
}
