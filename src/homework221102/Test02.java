package homework221102;

import java.util.Arrays;
/*
int[] number = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
int k = 3;
int[] number1 = {9, 10, 11, 0, 1, 2, 3, 4, 5, 6, 7, 8};
 */
public class Test02 {
    public static void main(String[] args) {
        int[] number = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int k = 3;
        //int[] number1 = {9, 10, 11, 0, 1, 2, 3, 4, 5, 6, 7, 8};
        int[] number1 = new int[number.length];
        int j = number.length - k;
        for (int i = 0; i < number.length; i++) {
            number1[i] = number[j];
            j++;
            if (j >= number.length) {
                j = 0;
            }
        }
        System.out.println(Arrays.toString(number1));
    }
}
