package profJava.homework221219;

import java.util.Arrays;

/*Написать метод, который проходится по массиву Int[]
умножает каждое четное число на 3 а не четное на 5,
далее надо отфильтровать числа, которые больше 25 и посчитать их сумму и вывести на экран.*/
public class Task1 {

    public static void main(String[] args) {
        int[] arr = {2, 7, 5, 64, 8, 33};
        System.out.println(findOurSum(arr));
    }

    private static int findOurSum(int[] arr) {
        return Arrays.stream(arr)
                .map(el -> el % 2 == 0 ? el * 3 : el * 5)
                .filter(e -> e > 25)
                .reduce((num1, num2) -> num1 + num2)
                .orElse(0);
    }

}
