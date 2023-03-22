package algorithm.lesson230316;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//    Проверьте, равны ли два массива или нет
//    Учитывая два массива, arr1 и arr2 одинаковой длины N,
//    задача состоит в том, чтобы определить, равны ли данные массивы или нет.
//    Два массива называются равными, если:
//    оба они содержат один и тот же набор элементов,
//    расположение (или перестановки) элементов может/не может быть одинаковым.
public class Task1 {
    public static void main(String[] args) {

    }



    // Brute force approach
    // for each element in arr
    //      find that element in arr2

    // What if element can be repeated

    // time complexity average O(n log n), O(n^2)
    // space complexity O(1)

    public static boolean compareArrayNaive(int[] arr, int[] arr2) {

        if (arr.length != arr2.length) {
            return false;
        }

        Arrays.sort(arr);
        Arrays.sort(arr2);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    // build map counting frequencies in arr - map1
    // build map counting frequencies in arr2 - map2
    // compare maps by key and value

    // time complexity O(n)
    // space complexity O(n)
    public static boolean compareArrayGPT(int[] arr, int[] arr2) {
        if (arr.length != arr2.length) {
            return false;
        }

        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int num1 = arr[i];
            int num2 = arr2[i];

            map1.put(num1, map1.getOrDefault(num1, 0) + 1);
            map2.put(num2, map2.getOrDefault(num2, 0) + 1);
        }

        return map1.equals(map2);
    }


    public static boolean checkArraysEqualityGPT(int[] arr, int[] arr2) {
        if (arr.length != arr2.length) {
            return false;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int num1 = arr[i];
            int num2 = arr2[i];

            map.put(num1, map.getOrDefault(num1, 0) + 1);
            map.put(num2, map.getOrDefault(num2, 0) - 1);
        }

        for (int count : map.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean compareArray(int[] arr, int[] arr2) {
        if (arr.length != arr2.length) {
            return false;
        }

        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            // build map counting frequencies in arr - map1
            Integer frequency = map.getOrDefault(arr[i], 0);
            map.put(arr[i], frequency + 1);
            // build map counting frequencies in arr2 - map2
            Integer frequency2 = map2.getOrDefault(arr2[i], 0);
            map2.put(arr2[i], frequency2 + 1);
        }

        // compare maps by key and value
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            Integer frequency2 = map2.get(entry.getKey());
            if (!entry.getValue().equals(frequency2)) {
                return false;
            }
        }
        return true;
    }

    // build map counting frequencies in arr - map1
    // decrease frequencies
    public static boolean compareArray2(int[] arr, int[] arr2) {
        if (arr.length != arr2.length) {
            return false;
        }

        Map<Integer, Integer> map = new HashMap<>();
        // build map counting frequencies in arr - map1
        for (int i = 0; i < arr.length; i++) {
            map.compute(arr[i], (key, oldVal) -> oldVal == null ? 1 : oldVal + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            Integer frequency = map.getOrDefault(arr2[i], 0);
            if (frequency == 0) {
                return false;
            }
            else {
                map.put(arr2[i], frequency - 1);
            }
        }

        return true;
    }
}
