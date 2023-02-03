package algorithm.lesson230202;
/*Find the smallest missing positive element in a sorted array of positive integers. O(log(n))
    Example:   [1, 2, 6, 31]
    Result: 3
    Example:  [2, 3, 4, 6, 9, 11, 15]
    Result: 1
    public static int smallestMissing(int[] arr)
    throw new UnsupportedOperationException();
    }*/
public class Test1 {
    public static int smallestMissingON(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new UnsupportedOperationException("Input array is empty or null");
        }
        int n = arr.length;
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == mid + 1) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left + 1;
    }


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 6, 31}; //3
        int[] arr2 = {2, 3, 4, 6, 9, 11, 15}; //1
        int[] arr4 = {1,2,3,4,6};
        int[] arr3 = {};
        System.out.println(smallestMissingON(arr1));
        System.out.println(smallestMissingON(arr2));
        //System.out.println(smallestMissingON(arr3));
        System.out.println(smallestMissingON(arr4));
        System.out.println("---");

    }
}
