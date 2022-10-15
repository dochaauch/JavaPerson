package homework221012;

import java.util.Arrays;
import java.util.Random;

public class ArrayChar {
    public static void main(String[] args) {
        char[] arrChar = new char[25];
        cycleForEach(arrChar);
    }

    private static void cycleForEach(char[] arrChar) {
        for (char  ch: arrChar) {
            ch = (char) new Random().nextInt(65535);
        }
        System.out.println((arrChar));
    }
}
