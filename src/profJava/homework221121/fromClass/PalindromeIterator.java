package profJava.homework221121.fromClass;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
/*Написать метод который проверяет переменную String s на палиндром
* 1. Доделать палиндром
 * 2. Добавить проверку на индекс (чтобы проверять только до середины)*/

public class PalindromeIterator {


    public static void main(String[] args) {
        String s = "а роза упала на лапу Азора";
        System.out.println(isPalindrome(s));
    }

    private static boolean isPalindrome(String s) {
        List<Character> listAhead = new LinkedList<>();
        for (char c : s.replaceAll("\\s", "").toLowerCase().toCharArray())
            listAhead.add(c);

        ListIterator<Character> listAheadIterator = listAhead.listIterator();
        ListIterator<Character> listBackIterator = listAhead.listIterator(listAhead.size());

        for  (int i = 0; i < listAhead.size() / 2; i++) {
            if (!Objects.equals(listAheadIterator.next(), listBackIterator.previous())){
                return false;
            }
        }
        return true;
    }
}


