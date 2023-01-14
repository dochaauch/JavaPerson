package algorithm.home221213;

import java.util.Arrays;

/*Имея два отсортированных массива размера m и n соответственно, вам нужно найти элемент,
который будет находиться на k-й позиции в конечном отсортированном массиве.
Массив 1 - 100 112 256 349 770
Массив 2 - 72 86 113 119 265 445 892
к = 7
Вывод : 256
Окончательный отсортированный массив -
72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892
7-й элемент этого массива равен 256.


***Naive approach
1. unite arrays into one => O(n) n-sum of lengths of array
2. sort result array // merge sort O(n log n)
3. take k-1 element // O(1)

A = [1,4,5], B=[3,7,8], k = 3
1. R = [1,4,5,3,7,8], k = 3
2. R = [1,3,4,5,7,8]
3. return R[k-1]

-time complexity O(n log n) =>  берем максимальную
-space complexity O(n) n-sum of lengths of array


***Merge approach
1. Merge sorted arrays
2. Take k-1 element
A = [1,4,5], B=[3,7,8], k = 3
1. R = [1,3,4,5,7,8]
2. return R[2] => O(1)
-time complexity O(n) n-sum of lengths of array
-space complexity O(n) n-sum of lengths of array

***K-limited merge approach
1.Merge sorted arrays until k
2.Take the last element
A = [1,4,5], B=[3,7,8], k = 3
1.R=[1,3,4]
2.return R[2]
-time complexity O(k) (worst case O(n))
-space complexity O(k) (worst case O(n))

***K-limited approach
1.Count 'merged' items until k
2.count==k, return element
A = [1,4,5], B=[3,7,8], k = 3
1. count = 0, while (count<k) compare the minimum in each array
2. count=k-1, return the current minimum
-time complexity O(k) (worst case O(n))
-space complexity O(1)

Summary
-time complexity O(n log n) => O(k) (worst case O(n))
-space complexity O(n) n-sum of lengths of array => space complexity O(1)

*/
public class Task02 {
    public static void main(String[] args) {
        int[] arr1 = {100, 112, 256, 349, 770};
        int[] arr2 = {72, 86, 113, 119, 265, 445, 892};
        System.out.println(findEl(arr1, arr2, 7));
    }

    public static int findEl(int[] array1, int[] array2, int position){
        int[] mergedArray = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, mergedArray, 0, array1.length);
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);
        Arrays.sort(mergedArray);
        return mergedArray[position-1];
    }
}
