package basicJava.lesson221012;

import java.util.Arrays;

public class Test {
    String name;
    int age;

    public Test(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Main {
    static int a = 0;

    public static void main(String[] args) {
        char[] chars = new char[11];
        int[] ints = {5, 3, 6, 7, 8, 10};
        for (char i = 'a'; i < chars.length; i++) {
            chars[a] = i;
        }
        a++;
        System.out.println(Arrays.toString(chars));
    }
}