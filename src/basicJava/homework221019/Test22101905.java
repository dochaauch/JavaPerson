package basicJava.homework221019;

import java.util.Arrays;
import java.util.Random;

/*
*просто заполнить массив только четными числами циклом while
* */
public class Test22101905 {
    private int[] fillArray(int[] array) {
        Random random = new Random();
        int[] array1 = new int[array.length];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(70);
            if (array1[i] % 2 != 0) {
                array1[i] = array1[i] + 1;
            }
        }
        return array1;
    }

    public static void main(String[] args) {
        Test22101905 test22101905 = new Test22101905();
        int[] array25 = new int[25];
        System.out.println(Arrays.toString(test22101905.fillArray(array25)));
    }
}
