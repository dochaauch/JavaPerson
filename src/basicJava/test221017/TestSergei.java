package basicJava.test221017;

import java.util.Arrays;
import java.util.Random;

public class TestSergei {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[22];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(51);
            if (arr[i] %2 == 0) {
                arr[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
