package algorithm.lesson230202;

import java.util.Stack;

/*    Validate brackets sequence of '[' and ']'

//    Example [[]]
//    Result: true

//    Example [[][]
//    Result: false

//    Example ][][
//    Result: false
*/
public class Test4 {
    public static boolean validate(String brackets) {
        Stack<Character> stack = new Stack<>();

        for (char bracket : brackets.toCharArray()) {
            if (bracket == '[') {
                stack.push(bracket);
            } else if (bracket == ']') {
                if (stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str1 = "[[]]"; //true
        String str2 = "[[][]"; //false
        String str3 = "][]["; //false

        System.out.println(validate(str1));
        System.out.println(validate(str2));
        System.out.println(validate(str3));
    }
}
