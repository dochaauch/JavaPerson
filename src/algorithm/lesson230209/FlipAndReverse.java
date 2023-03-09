package algorithm.lesson230209;

import java.util.Arrays;

/*Given an array 'arr[]' of positive integers, flip each group of subarrays to size 'K.'
Example 1:
K = 3
arr[] = {1,2,3,4,5}
Output: 3 2 1 5 4
Explanation: The first group consists of elements
1, 2, 3. The second group consists of 4,5.
Example 2:
K = 3
arr[] = {5,6,8,9}
Output: 8 6 5 9
Your task:
To write a reverse (arr, k) function that takes 'arr[]' and 'K' as input and modifies the array into place.*/
public class FlipAndReverse {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        reverse(arr, 3);
        System.out.println(Arrays.toString(arr));
    }


    //memory complexity O(n)
    //space complexity O(1)
    public static int[] reverse(int[] arr, int k) {
        for (int i = 0; i < arr.length; i+=k) {
            int groupUpperIndex = (arr.length - i)<k ? (arr.length - i) : k;
            //int groupUpperIndex = Math.min(arr.length - i, k);
            for (int j = 0; j < groupUpperIndex / 2; j++) {
                int tmp = arr[i+j];
                arr[i+j] = arr[i+groupUpperIndex-j-1];
                arr[i+groupUpperIndex - j-1] = tmp;
            }
        }
        return arr;
    }
}
