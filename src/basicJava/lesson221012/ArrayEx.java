package basicJava.lesson221012;

import java.util.Arrays;
import java.util.Random;

public class ArrayEx {
    public static void main(String[] args) {
        int[] array = new int[5]; //[0 0 0 0 0]
        int[] array1 = {98, 66, 44, 75, 44};
        char[] charArray = new char[5];
        String[] stringArray = new String[6];

        System.out.println(Arrays.toString(array1));
        System.out.println(array1);

        int[] array2 = new int [6]; // [_ _ _ _ _ _]
        for (int i = 0; i < array2.length; i++) {
            array2[i] = new Random().nextInt(55);
        }
        System.out.println(Arrays.toString(array2));
    }
}
