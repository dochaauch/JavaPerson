package algorithm.home221213;

/*Имея отсортированный массив arr[] и число x, напишите функцию,
которая подсчитывает вхождения x в arr[]. Ожидаемая временная сложность O(Log n)
arr[] = {1, 1, 2, 2, 2, 2, 3,}
x = 2
Вывод: 4 раза*/
public class Task03 {
    public static int binarySearch(int[] arr, int x, boolean searchFirst) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (x == arr[mid]) {
                result = mid;
                if (searchFirst) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else if (x < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 2, 3,};
        int x = 2;
        int first = binarySearch(arr, x, true);
        int last = binarySearch(arr, x, false);
        int count = last - first + 1;
        if (first != -1) {
            System.out.println("Element " + x + " occurs " + count + " times");
        } else {
            System.out.println("Element not found in the array");
        }
    }
}
