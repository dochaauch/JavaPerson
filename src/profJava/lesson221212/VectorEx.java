package profJava.lesson221212;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("11");
        list.add("22");
        list.add("33");
        list.add("44");

        System.out.println(list);

        Vector<String> vector = new Vector<>();
        vector.add("@@");
        vector.add("$$");
        vector.add("##");
        vector.add("^^");
        vector.add("&&");

        System.out.println(vector);
        vector.add(5, "555");
        System.out.println(vector.get(5));
        vector.lastElement();
    }
}
