package basicJava.homework221019;

import java.util.Arrays;
import java.util.Random;

public class TestSergei221019 {
    public int[] fillMassive(int[] array) {
        Random random = new Random();
        int index = 0;
        int quantityFill = 1;
        while (index < array.length) {
            int iteration = quantityFill;
            while (iteration != 0) {
                if (index >= array.length) {
                    break;
                }
                array[index] = random.nextInt(1, 5);
                --iteration;
                ++index;
            }
            iteration = quantityFill;
            while (iteration != 0) {
                --iteration;
                ++index;
            }
            ++quantityFill;  // итерация - на первой - заполяем один, на второй заполняем два
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[15];
        TestSergei221019 testSergei221019 = new TestSergei221019();
        System.out.println(Arrays.toString(testSergei221019.fillMassive(array)));
    }
}
