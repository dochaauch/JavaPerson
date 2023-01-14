package algorithm.lesson221215;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

    }

    //hanoi tower template
    public static void moveRing(Stack<Integer> initial, Stack<Integer> target, Stack<Integer> helper, int numOfRings){
        if(numOfRings == 1){
            //from initial to target
        } else {
            // n-1 ring from initial to helper
            // last disk from initial to target
            // n-1 rings  from helper to target
        }
    }

    // quick sort
    // 1. Choose some element in array (for example, take the last one)
    // 2. Divide array in two parts:
    //      all elements less than pivot to the left part,
    //      all elements more than pivot to the right part
    //      pivot takes the right place in sorted array
    // 3. Recursive call for the left part and right part.
    // arr = [9,5,12,6,13,4,7]
    // 1. pivot = 7 (last)
    // left + pivot + right, left = [5,6,4], right=[9,12,13]
    //      left: pivot = 4, left=[], right=[5,6]
    //      right: pivot = 13, left=[9,12], right=[]

    //time complexity O(n log n) best and average case, O(n^2) the worst case
    //space complexity O(n log n) best and average case, O(n^2) the worst case


    public static int[] quickSortNaive(int[] arr) {
        //base case of recursion if arr has 0,1,2 elements
        int n = arr.length;
        if (n == 0 || n == 1) {
            return arr;
        }
        else if (n == 2) {
            if (arr[0] <= arr[1]) {
                //then arr is already sorted
                return arr;
            }
            else {
                //swap arr[0] and arr[1]
                swap(arr, 1, 0);
                return arr;
            }
        }

        // choose pivot
        int pivot = arr[n -1]; //O(1)

        //create left  array
        int leftCount = 0;
        for (int i = 0; i < n-1; i++) {//O(n)
            if(arr[i] <= pivot) {
                leftCount++;
            }
        }
        int[] leftPart = new int[leftCount];

        //create right array
        int[] rightPart = new int[n -leftCount -1];

        for (int i = 0, l= 0, r=0; i < n-1; i++) {//O(n)
            if(arr[i]<= pivot) {
                leftPart[l] = arr[i];
                l++;
            } else {
                rightPart[r] = arr[i];
                r++;
            }
        }


        // sortedLeft = recursive call on left
        // sortedRight = recursive call on right
        int[] sortedLeft = quickSortNaive(leftPart); //O(n) or O(log n)
        //sortedLeft.length  = count
        int[] sortedRight = quickSortNaive(rightPart); //O(n) or O(log n)
        //sorted.length = n-1-count

        // return sortedLeft + pivot + sortedRight
        int[] result = new int[n];
        int leftPartLenght = sortedLeft.length;
        for (int i = 0; i < leftPartLenght; i++) { // O(n)
            result[i] =sortedLeft[i];
        }
        result[leftPartLenght] = pivot;

        for (int i = 0; i < sortedRight.length; i++) { // O(n)
            result[leftPartLenght + 1] = sortedRight[i-1];
        }
        return result;
    }

    //n
    //2 arrays n/2 //first level of recursion
    //4 arrays n/4 //second level of recursion
    //8 arrays n/8
    //...
    //n arrays 0 or 1 or 2


    //time complexity O(n log n), O(n^^) the worst case
    //space complexity O(1) (O n log n) recursive calls
    public static void quickSort(int[] arr, int start, int end) {
        //base case of recursion if arr has 0,1,2 elements
       if(end <= start){
       } else {
           int indexPivot = partition(arr, start, end); // O(n), n= end-start
           quickSort(arr, start, indexPivot-1); //O(log n), the worst case O(n) recursive calls
           quickSort(arr, indexPivot+1, end);//O(log n), the worst case O(n) recursive calls
       }
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int indexPivot = start;
        for (int i = start; i < end; i++) {
            if(arr[i] <= pivot) {
                swap(arr, indexPivot, i);
                indexPivot++;
            }
        }
        swap(arr, indexPivot, end);
        return indexPivot;
    }

    private static void swap(int[] arr, int indexPivot, int i) {
        int tmp = arr[i];
        arr[i] = arr[indexPivot];
        arr[indexPivot] = tmp;
    }

}
