package profJava.lesson230123;

import java.util.Arrays;
import java.util.List;

public class MR2 {
    public static void main(String[] args) {
        List<String> names
                = Arrays.asList("Alexandr", "Raul", "Uliana", "Elina");
        names.forEach(el -> System.out.println());
        names.forEach(System.out::println);
        for (String name : names) {
            System.out.println(name);
        }
    }
}
