package profJava.lesson221123;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Konstantin");
        list.add("Elina");
        list.add("Elena");
        list.add("Mikhail");

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
