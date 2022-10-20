package homework221019;

import java.util.Arrays;
import java.util.Random;

/*заполняет массив рандомом так: первый элемент - последний, второй - предпоследний,
третий - третий с конца итд пока все не заполниться.
* */
public class Test22101906 {
    private int[] fillArray(int[] array) {
        Random random = new Random();
        int[] array1 = new int[array.length];
        for (int i = 0; i < array1.length / 2; i++) {
            array1[i] = random.nextInt(75);
            array1[array.length - i - 1] = random.nextInt(75);
        }
        if (array1.length %2  != 0) {
            array1[array1.length / 2] = random.nextInt(75);
        }
        return array1;
    }

    public static void main(String[] args) {
        Test22101906 test22101906 = new Test22101906();
        int[] array15 =  new int[15];
        int[] array16 =  new int[16];
        System.out.println(Arrays.toString(test22101906.fillArray(array15)));
        System.out.println(Arrays.toString(test22101906.fillArray(array16)));
    }
}
