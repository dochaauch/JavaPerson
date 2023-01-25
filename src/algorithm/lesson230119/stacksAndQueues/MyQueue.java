package algorithm.lesson230119.stacksAndQueues;
/*Классическая Queue - реализовать используя массив (Array)
pushToEnd(int data) - вставляет элемент в конец queue
remove() - удаляет элемент из начала queue
peek() - возвращает элемент из начала не удаляя его
isEmpty()
size()
начало:
public class Queue
private int[] arr;      // массив для хранения элементов queue
private int head;      // head указывает на передний элемент в queue
private int tail;       // tail часть указывает на последний элемент в queue
private int capacity;   // максимальная емкость queue
private int count;      // текущий размер queue

// Конструктор для инициализации queue
public Queue(int size)
{
    arr = new int[size];
    capacity = size;
    head = 0;
    tail = -1;
    count = 0;
}
// ?? ….. дальше самостоятельно*/
public class MyQueue {
    private int[] arr;      // array to store the elements of the queue
    private int head;       // head pointer pointing to the front element in the queue
    private int tail;       // tail pointer pointing to the last element in the queue
    private int capacity;   // maximum capacity of the queue
    private int count;      // current size of the queue

    // constructor to initialize the queue
    public MyQueue(int size) {
        arr = new int[size];
        capacity = size;
        head = 0;
        tail = -1;
        count = 0;
    }

    public void pushToEnd(int data) {
        if (count == capacity) {
            throw new RuntimeException("Queue is full");
        }
        tail = (tail + 1) % capacity;
        arr[tail] = data;
        count++;
    }

    public int remove() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        int data = arr[head];
        head = (head + 1) % capacity;
        count--;
        return data;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return arr[head];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(4);
        System.out.println(myQueue.size());
        System.out.println(myQueue.isEmpty());
        //myQueue.peek();
        //myQueue.remove();
        myQueue.pushToEnd(1);
        myQueue.pushToEnd(2);
        myQueue.pushToEnd(3);
        myQueue.pushToEnd(4);
        //myQueue.pushToEnd(5);

        System.out.println(myQueue.peek());

    }


}
