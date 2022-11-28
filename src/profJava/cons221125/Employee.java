package profJava.cons221125;


public class Employee implements Comparable<Employee> {
    private String name;
    private String secondName;
    private Double experience;
    private Integer salaryEuro;
    private Integer yearStarted;
    private EmployeeType eType;

    public Employee(String name, String secondName, Integer salaryEuro,
                    int yearStarted, Double experience, EmployeeType eType) { //конструктор
        this.name = name;
        this.secondName = secondName;
        this.salaryEuro = salaryEuro;
        this.yearStarted = yearStarted;
        this.experience = experience;
        this.eType = eType;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public Integer getYear() {
        return yearStarted;
    }

    public Double getExperience() {
        return experience;
    }

    public Integer getSalaryEuro() {
        return salaryEuro;
    }

    @Override
    public int compareTo(Employee o) {
        int res = this.name.compareTo(o.name);
        if(res == 0) {
            res = this.secondName.compareTo(o.secondName);
        }
        return res;
        //return (int)(this.yearStarted - o.yearStarted); если нам нужно по году. Comparable дает только 1 сортировку
    }
}
