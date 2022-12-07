package profJava.lesson221205.treeset;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(52);
        treeSet.add(53);
        treeSet.add(54);
        treeSet.add(55);
        treeSet.add(511);
        //treeSet.add(null); => нельзя добавлять null в TreeSet
        System.out.println(treeSet);
    }
}
