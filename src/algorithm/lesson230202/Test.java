package algorithm.lesson230202;

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
public class Test {
    public static int[] reverse(int[] arr, int k) {
        for (int i = 0; i < arr.length; i += k) {
            int left = i;
            int right = Math.min(i + k - 1, arr.length - 1);
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {5,6,8,9};
        int[] arr3 = {1,2,3,4,5,6,7,8,9};
        int k = 3;
        System.out.println(Arrays.toString(reverse(arr1, k)));
        System.out.println(Arrays.toString(reverse(arr2, k)));
        System.out.println(Arrays.toString(reverse(arr3, k)));
    }
}
