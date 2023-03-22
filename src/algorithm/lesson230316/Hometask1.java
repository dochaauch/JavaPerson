package algorithm.lesson230316;

import java.util.Arrays;

/*
//    Дан отсортированный массив arr (отсортированный в порядке возрастания),
//    содержащий N целых чисел, найти, существует ли какая-либо пара элементов (arr[i], arr[j]),
//    сумма которых равна X.*/
public class Hometask1 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 35, 50, 75, 80};
        int x = 70; // 20+50
        System.out.println(x);
        System.out.println(findPair(arr, x));
        System.out.println(Arrays.toString(findPairInd(arr, x)));
        System.out.println(Arrays.toString(findPairVal(arr, x)));

        int y = 55; // 20 + 35
        System.out.println(y);
        System.out.println(findPair(arr, y));
        System.out.println(Arrays.toString(findPairInd(arr, y)));
        System.out.println(Arrays.toString(findPairVal(arr, y)));

        int z = 1000; //null
        System.out.println(z);
        System.out.println(findPair(arr, z));
        System.out.println(Arrays.toString(findPairInd(arr, z)));
        System.out.println(Arrays.toString(findPairVal(arr, z)));

    }

    public static boolean findPair(int[] arr, int X) {
        int N = arr.length;
        int splitIndex = binarySearch(arr, X / 2);
        int i = splitIndex - 1;
        int j = splitIndex;

        // если последний элемент больше X / 2, то он не может быть частью пары
        if (j < N && arr[j] == X / 2) {
            j++;
        }

        while (i >= 0 && j < N) {
            int sum = arr[i] + arr[j];
            if (sum == X) {
                return true;
            } else if (sum < X) {
                j++;
            } else {
                i--;
            }
        }
        return false;
    }

    private static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static int[] findPairInd(int[] arr, int X) {
        int N = arr.length;
        int splitIndex = binarySearch(arr, X / 2);
        int i = splitIndex - 1;
        int j = splitIndex;

        // если последний элемент больше X / 2, то он не может быть частью пары
        if (j < N && arr[j] == X / 2) {
            j++;
        }

        while (i >= 0 && j < N) {
            int sum = arr[i] + arr[j];
            if (sum == X) {
                return new int[] {i, j};
            } else if (sum < X) {
                j++;
            } else {
                i--;
            }
        }
        return null;
    }

    public static int[] findPairVal(int[] arr, int X) {
        int N = arr.length;
        int splitIndex = binarySearch(arr, X / 2);
        int i = splitIndex - 1;
        int j = splitIndex;

        // если последний элемент больше X / 2, то он не может быть частью пары
        if (j < N && arr[j] == X / 2) {
            j++;
        }

        while (i >= 0 && j < N) {
            int sum = arr[i] + arr[j];
            if (sum == X) {
                return new int[] {arr[i], arr[j]};
            } else if (sum < X) {
                j++;
            } else {
                i--;
            }
        }
        return null;
    }
}
