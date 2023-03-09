package profJava.cons230224.threadexecutors;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class App {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        String[] files = {"./src/profJava/cons230224/threadexecutors/file1.txt",
                "./src/profJava/cons230224/threadexecutors/file2.txt",
                "./src/profJava/cons230224/threadexecutors/file3.txt",
                "./src/profJava/cons230224/threadexecutors/file4.txt"};
        List<Future<Integer>> fList = new ArrayList<>();
        for (String file : files) {
            Future<Integer> f = //объект еще не определен, данные получить еще нельзя
                executor.submit(() -> processFile(file));
            //Integer i = f.get(); //получаем значение. происходит блок
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
        System.out.println("maximum value from 4 files " + max);
        executor.shutdown(); //заканчивает задачи

    }

    public static Integer processFile(String name) {
        Integer res = Integer.MIN_VALUE;
        try (BufferedReader reader = new BufferedReader(new FileReader(name))) {
            res = reader.lines() //поток
                    .map(s -> s.split(" ")) //возвращает массив строк
                    .flatMap(s -> Arrays.stream(s))
                    .filter(s -> s.length() != 0)
                    .map(Integer::parseInt)//тут может быть RunTimeExcep
                    .max(Integer::compareTo)
                    .get();
        } catch (IOException io) { //fileReader может сгенерировать исключение
            System.out.println(io);
        }
//        System.out.println(
//                String.format("file %s max value %d", name, res)
        //);
        return res;
    }
}
