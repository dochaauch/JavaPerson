package basicJava.lesson221102;

import java.util.Scanner;

/*How to determine the number of words in a line
The task:
Write a method that determines how many words you entered from the console.*/
public class Test01 {
    public static void main(String[] args) {
        System.out.println("Введите произвольную строку из нескольких слов:");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println(string);
        char[] charArray = string.toCharArray();
        int res = 0;
        for (int i = 0; i < string.length(); i++) {
            if(Character.isWhitespace(charArray[i])) {
                res++;
            }
        }
        System.out.println("количество слов равно "+ (res+1));
    }
}
