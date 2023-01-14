package profJava.lesson221219.streams;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,5,7,765,44,6,33,7789,3,25};
        //map()
        int[] map = Arrays.stream(numbers)
                .map(el -> el * 2)
                .toArray();
        System.out.println(Arrays.toString(map));


        Arrays.stream(numbers)
                .filter(el -> el % 5 == 0)
                .forEach(el -> System.out.println(el));

        //reduce()
        int reduce = Arrays.stream(numbers)
                .reduce((num1, num2) -> num1 + num2)
                .getAsInt();

        //sorted()
        int[] sorted = Arrays.stream(numbers)
                .sorted().toArray();
        System.out.println(Arrays.toString(sorted));

        //method chaining
        int chaining = Arrays.stream(numbers)
                .filter(el -> el%2==1)
                .map(el -> {
                    if(el %5 ==0){
                        el = el / 5;
                    }
                    return  el;
                }).reduce((el1, el2) -> el1 * el2)
                .getAsInt();
        System.out.println(chaining);

        //distinct()
        int[] dis = {1,1,1,2,2,2,3,4,5,6,6,6,7,2,4,1};
        Arrays.stream(dis)
                .distinct()
                .forEach(System.out::println);

        long a = Arrays.stream(dis)
                .count();
        System.out.println(a);
    }
}
