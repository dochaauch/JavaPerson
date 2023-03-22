package algorithm.lesson230316;

public class PalindromCheck {

    public static void main(String[] args) {

    }


//    Для заданной строки напишите рекурсивную функцию,
//    которая проверяет, является ли данная строка палиндромом,
//    иначе не палиндромом.
//
//    Input : malayalam
//    Output : Yes
//    Reverse of malayalam is also
//    malayalam.
//
//    Input : max
//    Output : No
//    Reverse of max is not max.

    // split string by half
    // iterate over each half

    // idea sort each half and compare sets

    // compare first to last iterating n/2

    // recursion
    // base case - empty string

    public static boolean isPalindrome(String str) {
        int len = str.length();
        char[] chars = str.toCharArray();
        for (int i = 0; i < len/2; i++) {
            if (chars[i] != chars[len-1-i]) {
                return false;
            }
        }
        return true;
    }
}