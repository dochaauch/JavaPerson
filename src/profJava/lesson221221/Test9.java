package profJava.lesson221221;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test9 {

    static Random random = new Random();
    static List<Integer> integers = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 0; i < 10_000_000; i++) {
            integers.add(random.nextInt(22));
        }

        long time = System.currentTimeMillis();
        long sum = integers.parallelStream()
                .reduce(Integer::sum).get();
        System.out.println(System.currentTimeMillis() - time);
    }
}
