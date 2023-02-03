package algorithm.lesson230126.myLinkedList;

public class MyLinkedList<T> {
    private Node<T> head;

    public MyLinkedList(Node<T> head) {
        this.head = head;

    }

    public T get(int index){
        int tmp = 0;
        Node<T> node = head;
        while (node != null && node.getNext() != null && tmp != index) {
            tmp++;
            node = node.getNext();
        }
        if (tmp == index) return node.getData();
        else return null;

    }
    public void pushToHead(T data) {
        Node<T> node = new Node(data);
        if(head == null){
            head = node;
        } else {
            node.setNext(head);
            head = node;
        }
    }

    public void print() {
        System.out.println();
        System.out.println("-".repeat(10));
        Node<T> node = head;
        while (node != null) {
            System.out.print(node.getData() + " ");
            node = node.getNext();
        }
        System.out.println();
        System.out.println("-".repeat(10));
        System.out.println();
    }

    public void pushToTail(T data) {
        Node<T> node = new Node<>(data);
        if (head == null) {
            head = node;
        } else {
            Node<T> last = getLast();
            last.setNext(node);
        }
    }

    public T removeHead(){
        T data = null;
        if (head != null){
            data = head.getData();
            head = head.getNext();
        }
        return data;
    }

    public void removeTail() {
        if (head != null && head.getNext() != null) {
            Node<T> last = getLast();
            Node<T> preLast = head;

            while (preLast != null && preLast.getNext() != last) {
                preLast = preLast.getNext();
            }
            preLast.setNext(null);
        }else {
            head = null;
        }
    }

    private Node<T> getLast(){
        Node<T> last = head;
        while (last != null && last.getNext() != null) {
            last = last.getNext();
        }
        return last;
    }

    public boolean pushToIndex(int index, T data) {
        if (index < 0) return false;
        if (index == 0) {
            pushToHead(data);
            return true;
        }
        int tmp = 0;
        Node<T> node = head;
        while (node != null && node.getNext() != null && tmp != index - 1) {
            tmp++;
            node = node.getNext();
        }
        if (tmp == index - 1) {
            Node<T> newNode = new Node<>(data);
            newNode.setNext(node.getNext());
            node.setNext(newNode);
            return true;
        } else {
            return false;
        }
    }

    public T remove(int index){
        if (head != null){
            if (index == 0){
                return removeHead();
            } else {
                int tmp = 0;
                Node<T> node = head;
                while (node != null && node.getNext() != null && tmp != index - 1) {
                    tmp++;
                    node = node.getNext();
                }
                if (tmp == index - 1){
                    T data = (T) node.getNext().getData();
                    node.setNext(node.getNext().getNext());
                    return data;
                } else {
                    return null;
                }
            }
        } else {
            return null;
        }
    }
}
