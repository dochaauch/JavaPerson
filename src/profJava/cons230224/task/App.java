package profJava.cons230224.task;
/*calculate the square of a number and calculate maximum
List<Integer> numbers = List.of(1, 2, 3, 4, 5,6,7,8,9,10);*/

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class App {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Integer> numbers = List.of(1, 2, 3, 4, 5,6,7,8,9,10);
        List<Future<Integer>> fList = new ArrayList<>();
        for (int num : numbers) {
            Future<Integer> f = executor.submit(() -> squareNumber(num));
            fList.add(f);
        }
        Integer max = fList
                .stream()
                .map(f -> {
                    Integer res = Integer.MIN_VALUE;
                    try {
                        res = f.get();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    }
                    return res;
                })
                .max(Integer::compareTo)
                .get();
        System.out.println("max is " + max);
        executor.shutdown();
    }

    public static int squareNumber(int number) {
        return number * number;
    }
}
