package profJava.lesson221121;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Spliterator;

public class ListIteratorEx {
    public static void main(String[] args) {
        String s = "text";
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Ivan");
        linkedList.add("Petr");
        linkedList.add("Mikhail");
        linkedList.add("Nikolay");
        linkedList.add("Elena");
        linkedList.add("Svetlana");

        ListIterator<String> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("*".repeat(10));

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

    }

}
