package profJava.lesson221205.hashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Elina");
        stringSet.add("Alexey");
        stringSet.add("Jelena");
        stringSet.add("Oxana");
        stringSet.add("Anatolii");
        stringSet.add("Georgi");
        stringSet.add("Georgi");
        stringSet.add(null);
        for (String s: stringSet) {
            System.out.println(s);
        }
    }
}
