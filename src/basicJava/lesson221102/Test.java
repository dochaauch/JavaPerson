package basicJava.lesson221102;

import java.util.Arrays;
import java.util.Random;

/*Create an array of 8 random integers from the interval [1;10]
2. Display the array to the screen as a string
3. Replace every odd-indexed element with zero
4. Display the array again on a separate line*/
public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if(i%2 != 0){
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
