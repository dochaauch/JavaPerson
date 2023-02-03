package algorithm.lesson230126.myLinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>(null);
        list.pushToHead(5);
        list.pushToHead(4);
        list.pushToHead(3);
        list.pushToHead(2);
        list.print();

        list.pushToTail(1);
        list.print();
        list.removeTail();
        list.print();

        MyLinkedList<Integer> list1 = new MyLinkedList<>(null);
        list1.pushToTail(1);
        list1.print();
        list1.removeTail();
        list1.print();

        System.out.println("remove " + list.removeHead());

        list.print();
        System.out.println("-".repeat(10));

        System.out.println("remove " + list1.removeHead());
        list1.print();


        System.out.println("list 3");
        MyLinkedList<Integer> list3 =new MyLinkedList<>(null);
        list3.removeTail();
        list3.print();
    }
}
