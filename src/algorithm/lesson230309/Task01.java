package algorithm.lesson230309;

import java.util.HashMap;
import java.util.Map;

/*Первый элемент, встречающийся k раз в массиве
Дан массив из n целых чисел. Задача состоит в том, чтобы найти первый элемент, который встречается k раз.
Если ни один элемент не встречается k раз, выведите -1.
Распределение целочисленных элементов может быть в любом диапазоне.
Ввод : {1, 7, 4, 3, 4, 8, 7}, k = 2
Вывод : 7
Объяснение: И 7, и 4 встречаются 2 раза. Но 7 — это первое, которое встречается 2 раза.
O(n)*/
public class Task01 {
    public static int firstKOccurrence(int[] arr, int k) {
        Map<Integer, Integer> occurrenceCount = new HashMap<>();
        for (int elem : arr) {
            occurrenceCount.put(elem, occurrenceCount.getOrDefault(elem, 0) + 1);
        }
        for (int elem : arr) {
            if (occurrenceCount.get(elem) == k) {
                return elem;
            }
        }
        return -1;
    }



    public static void main(String[] args) {
        int[] arr = {1, 7, 4, 3, 4, 8, 7};
        int k = 2;
        int result = firstKOccurrence(arr, k);
        System.out.println(result); // 7
    }

}
