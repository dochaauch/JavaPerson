package profJava.lesson221128.example;

public class Test {
    public static void main(String[] args) {
        School school1 = new School("Oxana", 16);
        School school2 = new School("Konstantin", 15);

        Student student1 = new Student("Jelena",20);
        Student student2 = new Student("Alexey",21);

        Employee employee1 = new Employee("Pavel", 30);
        Employee employee2 = new Employee("Sergey", 31);

        Team<School> schoolTeam = new Team("SchoolTeam");
        Team<Student> studentTeam = new Team("Student Team");
        Team<Employee> employeeTeam = new Team("Employee Team");


        schoolTeam.addNewParticipant(school1);
        schoolTeam.addNewParticipant(school2);

        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        //Team<String> stringTeam = new Team<>("!!!!"); //так не надо



        //schoolTeam.addNewParticipant(student1); // как запретить?
    }
}
