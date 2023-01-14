package profJava.lesson221219.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class st1 {
    public static void main(String[] args) {
        //Array
        int[] arr =  {1,23,45,67,89,10};
        int a = Arrays.stream(arr)
                .map(el -> el*3)
                .reduce((el1, el2) -> el1+el2)
                .getAsInt();
        System.out.println(a);

        int w = Arrays.stream(arr)
                .filter(el -> el %3 == 0)
                .map(el -> el* 10)
                .reduce((el1, el2) -> el1 + el2)
                .getAsInt();

        Arrays.stream(arr)
                .map(el -> el* 3)
                .forEach(el -> System.out.println(el));

        //Collection
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 22; i++) {
            list.add(new Random().nextInt(55));
        }
        list.stream()
                .map(el -> el * 5)
                .collect(Collectors.toList());

    }
}
