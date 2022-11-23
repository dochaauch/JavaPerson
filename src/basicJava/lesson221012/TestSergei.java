package basicJava.lesson221012;

import java.util.Arrays;

public class TestSergei {
    public static void main(String[] args) {
        int[] array = new int[5];
        int[] array1 = {2, 2, 3};

        for (int i = 0; i < array.length; i++) {
            array[i] = (i + 3) * 3;
        }
        System.out.println(Arrays.toString(array));
    }
}
