package basicJava.homework221010;

public class Employee {
    private String name;
    private String sex;
    private Byte seniority;

    private Skills skills;

    public Employee(String name, String sex, Byte seniority) {
        this.name = name;
        this.sex = sex;
        this.seniority = seniority;
        this.skills = new Skills();
    }

    public Employee(String name, String sex, Byte seniority, boolean javaSkill, boolean englishSkill) {
        this.name = name;
        this.sex = sex;
        this.seniority = seniority;
        this.skills = new Skills(javaSkill, englishSkill);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Byte getSeniority() {
        return seniority;
    }

    public void setSeniority(Byte seniority) {
        this.seniority = seniority;
    }

    public Skills getSkills() {
        return skills;
    }

    public void setSkills(Skills skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", seniority=" + seniority +
                ", skills=" + skills +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Anatoli", "male", (byte) 5);
        System.out.println(employee);
        Employee employee1 = new Employee("Tatjana", "female", (byte) 10, false, true);
        System.out.println(employee1);
    }
}
