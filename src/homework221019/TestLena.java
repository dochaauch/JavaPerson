package homework221019;

import java.util.Arrays;
import java.util.Random;

/*метод принимает и возвращает массив
заполнить рандомными числами через одного
второй цикл заполнить через одного, числами, которые уже заполнили
в обратном порядке
* */
public class TestLena {
    public int[] getResult(int[] array) {
        int[] array1 = new int[array.length];
        Random random = new Random();

        for (int i = 0; i < array1.length; i = i + 2) {
            array1[i] = random.nextInt(55);
        }

        for (int i = 1; i < array1.length; i = i + 2) {
            if (array1.length %2 == 0) {
                array1[i] = array1[array1.length - (i + 1)];
            } else {
                array1[i] = array1[array1.length - i];
            }
        }
        return array1;
    }

    public static void main(String[] args) {
        int[] array8 = new int[8];
        int[] array7 = new int[7];
        TestLena testLena = new TestLena();
        System.out.println(Arrays.toString(testLena.getResult(array8)));
        System.out.println(Arrays.toString(testLena.getResult(array7)));
    }
}
