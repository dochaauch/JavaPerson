package basicJava.lesson221024;

import java.util.Arrays;
import java.util.Random;

public class Konstantin221024 {
    public static void fillArray(int[] array){
        int[] order = new int[array.length];
        int[] reverse = new int[array.length];
        for (int i = order.length - 1; i > -1; i--) {
            order[i] = new Random().nextInt(55);
        }
        System.out.println(Arrays.toString(order));
        for (int i = 0; i < order.length; i++) {
            reverse[i] = order[order.length - (1 + i)];
        }
        System.out.println(Arrays.toString(reverse));
    }

    public static void main(String[] args) {
        int[] array = new int[new Random().nextInt(40)];
        fillArray(array);
    }
}
