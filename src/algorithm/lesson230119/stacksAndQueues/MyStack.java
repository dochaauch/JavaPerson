package algorithm.lesson230119.stacksAndQueues;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Stack;
/*First level: 1. Реализовать метод search() у написанного на занятии стека MyStack (см. код в репозитории).
public int search(int element) -  определяет, существует ли объект в стеке.
Если элемент найден, возвращает позицию элемента с вершины стека. В противном случае он возвращает -1.*/
@Getter
@Setter
@ToString
public class MyStack {
    private int[] array;
    private int count;

    public MyStack(int size){
        array = new int[size];
        count = 0;
    }

    public void push(int element){
        if(count == array.length) throw new RuntimeException("Stack is full");
        array[count++] = element;
    }

    public int pop(){
//        int out = array[count-1];
//        count--;
        if(count == 0) throw new RuntimeException("Stack is empty");
        return array[--count];
    }

    public int peek() {
        if(count==0) throw new RuntimeException("Stack is empty");
        return array[count-1];
    }

    public int search(int element) {
        for (int i = count - 1; i >= 0; i--) {
            if (array[i] == element) {
                return count - i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        MyStack myStack = new MyStack(5);
//        myStack.push(1);
//        myStack.push(2);
//        myStack.push(3);
//        myStack.pop();
//        myStack.push(4);
//        myStack.push(5);
//        //myStack.push(6);
//        System.out.println(myStack);
//        System.out.println(myStack.peek());
//        System.out.println(myStack.pop());
//        System.out.println(myStack.pop());
//        System.out.println(myStack.pop());
//        System.out.println(myStack.pop());
        Stack<String>stack = new Stack<>();
        stack.push("One");
        stack.push("Two");
        stack.push("Three");
        stack.push("Four");
        System.out.println(stack);
        stack.pop();
        stack.forEach(System.out::println);
        System.out.println(stack.search("One"));
        System.out.println(stack.search(5));
    }


}
