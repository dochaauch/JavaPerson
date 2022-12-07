package profJava.lesson221205.treeset;

import java.util.TreeSet;

public class TreeSetEx1 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();
        Student st1 = new Student("Natalia", 22);
        Student st2 = new Student("Raul", 23);
        Student st3 = new Student("Sergey", 25);
        Student st4 = new Student("Olga", 26);
        Student st5 = new Student("Ivan", 28);
        Student st6 = new Student("Maxim", 28);


        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);
        treeSet.add(st5);
        treeSet.add(st6);

        System.out.println(treeSet);

        System.out.println(treeSet.subSet(st2, st3));
        treeSet.pollFirst();
        treeSet.first();
    }
}
