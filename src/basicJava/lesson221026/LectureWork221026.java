package basicJava.lesson221026;

import java.util.Arrays;
import java.util.Random;

/*
* приватный метод получает и возвращает массив интов
* первые 3 элемента рандом,
* следующие суммой предыдущих трех циклом while
*
* Произвести проверку, если длина массива == 3 то просто заполнить рандомом,
* если > 3 то так как мы и писали…с суммой, если < 3 то заполнить рандомом
* и сделать все числа четными.

Сделать еще один метод в нашем классе, который принимает
* получившийся массив из предыдущего метода и выводит каждый
* элемент массива на экран методом forEach();!!!

МЕТОД 2 ПОМЕСТИТЬ В МЕТОД 1
ЗАПУСТИТЬ ВСЕ MAIN

-**Вывод на экран во втором методе оформить как-нибудь красиво))*/
public class LectureWork221026 {
    private void fillArray(int[] array, int pos) {
        Random random = new Random();
        for (int i = 0; i < pos; i++) {
            array[i] = random.nextInt(100);
        }
    }

    private void showElement (int[] array) {
        int index = 0;
        for (int a : array) {
            System.out.println(index + 1 +" элемент массива " + Arrays.toString(array
            )+": " + a);
            index++;
        }
    }

    private void getArrays(int[] array1, int[] array2, int[] array3) {

    }

    private int[] getResult(int[] array) {
        int[] array1 = new int[array.length];
        int pos = 3;

        if (array1.length > pos) {
            fillArray(array1, pos);
            while (pos < array1.length) {
                array1[pos] = array1[pos - 3] + array1[pos - 2] + array1[pos - 1];
                pos++;
            }
        } else if (array1.length == pos) {
            fillArray(array1, pos);
        } else {
            fillArray(array1, array1.length);
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] % 2 != 0) {
                    array1[i] = array1[i] + 1;
                }
            }
        }
        showElement(array1);
        return array1;
    }

    public static void main(String[] args) {
        LectureWork221026 lectureWork = new LectureWork221026();
        int[] array10 = new int[10];
        int[] array3 = new int[3];
        int[] array2 = new int[2];

        lectureWork.getResult(array10);
        System.out.println("-+".repeat(35));
        lectureWork.getResult(array3);
        System.out.println("-+".repeat(35));
        lectureWork.getResult(array2);
    }
}
