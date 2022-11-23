package basicJava.lesson221019;

import java.util.Arrays;
import java.util.Random;

/*метод, который принимает и возвращает массив
заполняет рандомными числами до 55
проходится по массиву, проверяет четный элемент или нет
и меняет его на нечетный
не статический
* */
public class TestRobert {
    public int[] getArray(int[] array) {
        int[] array2 = new int[array.length];
        Random random = new Random();
        for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt(55);
        }
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] %2 == 0) {
                array2[i]++;
            } else {
                array2[i]++;
            }
        }
        return array2;
    }

    public static void main(String[] args) {
        int[] array3 = new int[13];
        TestRobert testRobert = new TestRobert();
        System.out.println(Arrays.toString(testRobert.getArray(array3)));
    }
}
