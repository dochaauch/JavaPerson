package algorithm.lesson230126.myLinkedList;

public class GenericDemo<T> {
    private final T data;

    public GenericDemo(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}

class MyCollection {
    private GenericDemo genericDemo;
}
