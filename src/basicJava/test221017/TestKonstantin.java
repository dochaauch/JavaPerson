package basicJava.test221017;

import java.util.Random;

public class TestKonstantin {
    static Random random = new Random();
    static int[] arr = new int[11];

    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(23);
        }
        int k = 0;
        while (k < arr.length) {
            System.out.println(arr[k]);
            k++;
            }
    }
}

