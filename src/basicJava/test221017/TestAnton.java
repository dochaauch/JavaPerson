package basicJava.test221017;

import java.util.Arrays;

public class TestAnton {
    public static void main(String[] args) {
        int[] arr1 = new int[22];
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i < arr2.length; i++) {
            arr1[i] = arr2[i];
        }
        System.out.println(Arrays.toString(arr1));
    }
}
