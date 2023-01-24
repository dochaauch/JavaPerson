package algorithm.lesson230119.stacksAndQueues;

import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> stackMin = new Stack<>();

    public void push(int element) {
        if(stack.empty()){
            stackMin.push(element);
        } else {
            stackMin.push(Math.min(stackMin.peek(), element));
        }
        stack.push(element);
    }

    public int pop(){
        stackMin.pop();
        return stack.pop();
    }

    public int getMin() {
        return stackMin.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(10);
        minStack.push(3);
        minStack.push(5);
        minStack.push(8);
        minStack.push(11);
        System.out.println(minStack.getMin());
        minStack.push(1);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());

    }

}
