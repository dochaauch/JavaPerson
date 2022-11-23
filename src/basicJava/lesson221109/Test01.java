package basicJava.lesson221109;

import java.util.List;
import java.util.Random;
import java.util.LinkedList;

public class Test01 {
    static Random random = new Random();
    //static List<Integer> list = new ArrayList<>();
    static List<Integer> list = new LinkedList<>();
    public static void main(String[] args) {
        for (int i = 0; i < 10_000_000; i++) {
            list.add(random.nextInt(11));
        }
        long time = System.currentTimeMillis();
        //double sum = list.parallelStream().reduce((acc, el) -> acc+el);
        double sum = list.parallelStream().reduce(Integer::sum).get();
        System.out.println(System.currentTimeMillis() - time);
    }
}
