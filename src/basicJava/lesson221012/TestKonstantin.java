package basicJava.lesson221012;

import java.util.Arrays;

public class TestKonstantin {
    public static void main(String[] args) {
        int[] arrayInt1 = new int[5];
        int[] arrayInt2 = {5, 6, 2, 4, 7};
        String[] arrayString1 = new String[5];
        String[] getArrayString2 = {"cat", "dog", "animal", "tiger", "lion"};
        float[] arrayFloat1 = new float[5];
        float[] arrayFloat2 = {2.4f, 5.6f, 6.0f, 3.7f};

        for (float f: arrayFloat2) {
            System.out.println(f);
        };
    }
}

class Anastasia {
    int[] arr;
    String[] arr1;

    public Anastasia(int[] arr, String[] arr1) {
        this.arr = arr;
        this.arr1 = arr1;
    }

    @Override
    public String toString() {
        return "Anastasia{" +
                "arr=" + Arrays.toString(arr) +
                ", arr1=" + Arrays.toString(arr1) +
                '}';
    }
}

class Main3 {
    public static void main(String[] args) {
        Anastasia anastasia = new Anastasia(new int[2], new String[2]);
        System.out.println(anastasia);
    }
}

