package profJava.lesson221212;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Elina");
        stack.push("Natalia");
        stack.push("Ivan");
        stack.push("Oxana");
        stack.push("Anatoli");

//        for (int i = 0; i < stack.size(); i++) {
//            System.out.println(stack.pop());
//        }
//        while (!stack.empty()) {
//            System.out.println(stack);
//            System.out.println(stack.pop());
//        }
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.add("999");
        stack.add(3, "0000");
        System.out.println(stack);
        System.out.println(stack.get(2));
    }

}
