package profJava.lesson221219.linkedHaspMap;

import profJava.lesson221205.treeset.Student;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student> lhm =
                new LinkedHashMap(10, 0.75f, true);
        Student student1 = new Student("Elina", 27);
        Student student2 = new Student("Oksana", 28);
        Student student3 = new Student("Anatolii", 29);
        Student student4 = new Student("Konstantin", 30);

        lhm.put(2.2, student1);
        lhm.put(3.5, student2);
        lhm.put(4.8, student3);
        lhm.put(1.2, student4);

        System.out.println(lhm);

        lhm.get(4.8);
        System.out.println(lhm);
    }


}
