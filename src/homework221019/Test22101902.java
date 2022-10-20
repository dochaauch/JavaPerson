package homework221019;

import java.util.Arrays;
import java.util.Random;
/*
* Написать метод который заполняет массив задом наперед*/
public class Test22101902 {
    private int[] fillArray(int[] array){
        Random random = new Random();
        int[] array1 = new int[array.length];
        for (int i = array1.length - 1;  i > -1; i--) {
            array1[i] = random.nextInt(55);
        }
        return array1;
    }

    public static void main(String[] args) {
        int[] array10 = new int[10];
        Test22101902 test22101902 = new Test22101902();
        System.out.println(Arrays.toString(test22101902.fillArray(array10)));
    }
}
