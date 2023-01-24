package profJava.homework221214;

import java.util.ArrayList;
import java.util.NoSuchElementException;

interface Queue {
    void enqueue(Object item);
    Object dequeue();
    boolean isEmpty();
}

class QueueImpl implements Queue {
    private ArrayList<Object> queue = new ArrayList<Object>();

    public void enqueue(Object item) {
        queue.add(item);
    }

    public Object dequeue() {
        if(queue.isEmpty()){
            throw new NoSuchElementException("Queue is empty");
        }
        return queue.remove(0);
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}

public class QueueTest {
    public static void main(String[] args) {
        Queue queue = new QueueImpl();
        queue.enqueue("Item 1");
        queue.enqueue("Item 2");
        queue.enqueue("Item 3");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.isEmpty());
    }
}