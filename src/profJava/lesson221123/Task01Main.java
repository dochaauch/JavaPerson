package profJava.lesson221123;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Input: { {"abc", 3}, {"a", 4}, {"bc", 5}, {"a", 2} }*/
public class Task01Main {
    public static void main(String[] args) {
        List<Task01> task01List = new ArrayList<>();
        Task01 t01 = new Task01("abc", 3);
        Task01 t02 = new Task01("a", 4);
        Task01 t03 = new Task01("bc", 5);
        Task01 t04 = new Task01("a", 2);

        task01List.add(t01);
        task01List.add(t02);
        task01List.add(t03);
        task01List.add(t04);

        System.out.println(task01List);
        Collections.sort(task01List, new Task01Comparator());
        System.out.println(task01List);
    }
}
