package algorithm.home221201;

/*1) Реализовать алгоритм бинарного поиска, который находит данный key в данном отстортированном массиве
public int binarySearch(int[] arr, int key)
Описание алгоритма из лекции
    binary search
    problem: find key in sorted array
    returns index of key
    arr = [1,4,7,9,12,15], key = 9
    take element from the middle 7
    compare to key 7 == 9 false
    compare to key 7 < 9
    if middle element less than key repeat procedure for right half of array
    if middle element more  than key repeat procedure for left half of arr*/
public class Task1 {
    public int binarySearch(int[] arr, int key) {
        int first = 0;
        int last = arr.length - 1;
        if (last >= first) {
            int mid = first + (last - first) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) {
                return recursiveBinarySearch(arr, first, mid-1, key);
            }
            return recursiveBinarySearch(arr, mid +1, last, key);
        }
        return -1;
    }

    public static int recursiveBinarySearch(int arr[], int first, int last, int key){
        if (last >= first) {
            int mid = first + (last - first) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) {
                return recursiveBinarySearch(arr, first, mid-1, key);
            }
            return recursiveBinarySearch(arr, mid +1, last, key);
        }
        return -1;
    }

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        int[] arr = {1,4,7,9,12,15,25};
        int key = 9;
        System.out.println(task1.binarySearch(arr, key));
    }
}
