package profJava.lesson221205.linkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetEx {
    public static void main(String[] args) {
        HashSet<Integer> set = new LinkedHashSet<Integer>();
        set.add(11);
        set.add(12);
        set.add(13);
        set.add(14);
        set.add(15);
        set.add(17);

        System.out.println(set);
        set.remove(17);
        System.out.println(set);
        System.out.println(set.contains(10));
    }

}
