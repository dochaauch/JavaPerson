package algorithm.lesson230119.stacksAndQueues;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueEx {

    public static void main(String[] args) {
        //Queue<String> queue = new PriorityQueue<>(Comparator.comparingInt(String::length));
        Queue<String> queue = new PriorityQueue<>();
        queue.add("One");
        queue.add("Two");
        queue.add("Three");
        queue.add("Four");
        queue.add("Five");

        System.out.println(queue);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        System.out.println(queue);

        queue.forEach(System.out::println);

    }
}
