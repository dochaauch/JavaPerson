package basicJava.homework221012;

import java.util.Arrays;
import java.util.Random;

public class Array {
    public static void main(String[] args) {
        int[] arrInt = new int[22];
        cycleForI(arrInt);
        cycleForEach(arrInt);
        cycleWhile(arrInt);
    }

    private static void cycleWhile(int[] arrInt) {
        int i = 0;
        while (i < arrInt.length) {
            arrInt[i] = new Random().nextInt(100);
            i++;
        }
        System.out.println(Arrays.toString(arrInt));
    }

    private static void cycleForEach(int[] arrInt) {
        for (int i: arrInt) {
            i = new Random().nextInt(100);
        }
        System.out.println(Arrays.toString(arrInt));
    }

    private static void cycleForI(int[] arrInt) {
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = new Random().nextInt(100);
        }
        System.out.println(Arrays.toString(arrInt));
    }
}

