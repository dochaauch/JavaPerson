package test221017;

import java.util.Arrays;
import java.util.Random;

//объявить пустой массив длиной 22
//заполнить рандом,диапазон до 100
//вывести на экран foreach
public class TestVera {
    static Random random = new Random();
    static int[] arr = new int[22];

    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(101);
        }
        for (int a: arr) {
            System.out.println(a);
        }
    }
}
