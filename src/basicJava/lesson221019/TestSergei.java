package basicJava.lesson221019;

import java.util.Arrays;
import java.util.Random;

/*метод принимает массив и возвращает массив
первая половина массива заполнить рандом
второя половина уже полученные рандом пополам
*/
public class TestSergei {
    public int[] getArray (int[] array){
        int[] array2 = new int[array.length];
        int count = 0;
        Random random = new Random();
        for (int i = 0; i < array2.length / 2; i++) {
            array2[i] = random.nextInt(100);
        }
        for (int i = array2.length / 2; i < array2.length; i++) {
            array2[i] = array2[count] / 2;
            count++;
        }
        return array2;
    }

    public static void main(String[] args) {
        int[] array3 = new int[13];
        TestSergei testSergei = new TestSergei();
        System.out.println(Arrays.toString(testSergei.getArray(array3)));
    }
}
