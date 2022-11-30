package profJava.lesson221128.intro;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //list.add(5);
        list.add("a");
        list.add("qa");
        list.add("aw");
        for (Object s : list) {
            System.out.println(s);
        }
    }
}
