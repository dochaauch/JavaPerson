package profJava.homework221214;

import java.util.ArrayList;
import java.util.NoSuchElementException;

interface Stack {
    void push(Object item);
    Object pop();
    boolean isEmpty();
}

class StackImpl implements Stack {
    private ArrayList<Object> stack = new ArrayList<Object>();

    public void push(Object item) {
        stack.add(item);
    }

    public Object pop() {
        if(stack.isEmpty()){
            throw new NoSuchElementException("Stack is empty");
        }
        return stack.remove(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}

public class StackTest {
    public static void main(String[] args) {
        Stack stack = new StackImpl();
        stack.push("Item 1");
        stack.push("Item 2");
        stack.push("Item 3");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
    }
}