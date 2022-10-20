package homework221019;

import java.util.Arrays;
import java.util.Random;

/*
первый заполнили - второй пропустили -
вторые два заполнили - вторые два пропустили -
следующие ТРИ заполнили - ТРИ пропустили ИТД
*/
public class Test22101904 {
    private int[] fillArray(int[] array) {
        Random random = new Random();
        int[] array1 = new int[array.length];
        int count = 1;
        int startPos = 0;
        int lastPos = 1;
        while (startPos < array1.length) {
            for (int i = startPos; i < lastPos; i++) {
                array1[i] = random.nextInt(55);
            }
            startPos = lastPos + count;
            count++;
            lastPos = startPos + count;
            if (lastPos >= array1.length) {
                lastPos = array1.length;
            }
        }
        return array1;
    }

    public static void main(String[] args) {
        Test22101904 test22101904 = new Test22101904();
        int[] array15 = new int[15];
        int[] array16 = new int[16];
        int[] array17 = new int[17];
        System.out.println(Arrays.toString(test22101904.fillArray(array15)));
        System.out.println(Arrays.toString(test22101904.fillArray(array16)));
        System.out.println(Arrays.toString(test22101904.fillArray(array17)));
    }
}
