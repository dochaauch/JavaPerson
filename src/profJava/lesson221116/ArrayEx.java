package profJava.lesson221116;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayEx {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        List<Integer> integerList = List.of(12,34,5,6,78);
        List<Integer> integerList1 = Arrays.asList(12, 34, 5, 6, 78);
        System.out.println(integerList);
        arrayList.add("OK");
        linkedList.add("Kon");

        arrayList.get(0);
        for (int i = 0; i < 10; i++) {
            arrayList.add("arr: " + i);
        }
        System.out.println(arrayList);
    }
}
