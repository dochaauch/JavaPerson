package profJava.lesson221128.wildCard;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<? extends Number> list = new ArrayList<Integer>();
//        list.add(5);
//        list.add(2.5);
        List<Double> list1 = new ArrayList<>();
        list1.add(2.5);
        info(list1);
    }

    static void info(List<?> list) {
        System.out.println(list);
    }
}
