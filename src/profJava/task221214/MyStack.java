package profJava.task221214;

public interface MyStack<T> {
    T push(T el);
    T pop();
    boolean empty();
}