package basicJava.homework221019;

import java.util.Arrays;
import java.util.Random;
/*Написать метод который заполнят массив числами так
первые два заполнили - вторые два пропустили*/

public class Test22101903 {
    private int[] fillArray(int[] array){
        int[] array1 = new int[array.length];
        Random random = new Random();

        for (int i = 0; i < array1.length; i = i + 4) {
            array1[i] = random.nextInt(55);
            array1[i + 1] = random.nextInt(55);
        }
        return array1;
    }

    public static void main(String[] args) {
        Test22101903 test22101903 =  new Test22101903();
        int[] array7 = new int[7];
        int[] array8 = new int[8];
        System.out.println(Arrays.toString(test22101903.fillArray(array7)));
        System.out.println(Arrays.toString(test22101903.fillArray(array8)));
    }
}
