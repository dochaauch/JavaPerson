package algorithm.lesson230209;
/*Find the smallest missing positive element in a sorted array of positive integers. O(log(n))
    Example:   [1, 2, 6, 31]
    Result: 3
    Example:  [2, 3, 4, 6, 9, 11, 15]
    Result: 1
    public static int smallestMissing(int[] arr)
    throw new UnsupportedOperationException();
    }*/
public class SmallestMissingElement {

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 6, 31};
        int result1 = smallestMissing(arr1);
        System.out.println("Result 1: " + result1);

        int[] arr2 = new int[]{2, 3, 4, 6, 9, 11, 15};
        int result2 = smallestMissing(arr2);
        System.out.println("Result 2: " + result2);

        int[] arr3 = new int[]{1, 2, 3, 4, 6, 9, 11, 15};
        int result3 = smallestMissing(arr3);
        System.out.println("Result 3: " + result3);

        int[] arr4 = new int[]{1, 2, 3, 4};
        int result4 = smallestMissing(arr4);
        System.out.println("Result 4: " + result4);
    }

    public static int smallestMissingNaive(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i +1) {
                int result = i-1 >0 ? arr[i-1] + 1 : 1;
                return result;
            }
        }
    return -1;
    }

    public static int smallestMissing(int[] arr) {
        return smallestMissing(arr, 0, arr.length-1);
    }

    private static int smallestMissing(int[] arr, int start, int end) {
        if(start>end) {
            return start;
        }
        int mid = start + (end-start)/2;
        if(arr[mid] == mid + 1){
            return smallestMissing(arr, mid +1, end);
        } else {
            return  smallestMissing(arr, start, mid-1);
        }
    }
}
