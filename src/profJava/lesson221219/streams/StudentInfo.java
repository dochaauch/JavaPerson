//package profJava.lesson221219.streams;
//
////import profJava.lesson221205.treeset.Student;
//
//import profJava.lesson221128.example.Student;
//
//import java.util.ArrayList;
//
//public class StudentInfo {
//    void testStudent(ArrayList<Student> al, StudentCheck sc){
//        for (Student s : al) {
//            if(sc.check(s)) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        Student st1 =new Student("Uliana", 38);
//
//        ArrayList<Student> students = new ArrayList<>();
//        students.add(st1);
//
//        StudentInfo info = new StudentInfo();
//        info.testStudent(students, s -> s.getAvgGrade() > 8);
//    }
//}
//
//@FunctionalInterface
//interface StudentCheck{
//    boolean check(Student s);
//}
//
//class CheckOverGrade implements StudentCheck {
//
//    @Override
//    public boolean check(Student s) {
//        return s.getAvgGrade() > 8;
//    }
//}