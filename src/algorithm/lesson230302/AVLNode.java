package algorithm.lesson230302;

import lombok.Getter;
import lombok.Setter;

@Getter
public class AVLNode<T> {
    @Setter
    private AVLNode<T> left;
    @Setter
    private AVLNode<T> right;
    private int balance;
    @Setter
    private int height;
    private int key;
    private T data;

    public AVLNode(int key, T data) {
        this.key = key;
        this.data = data;
    }
}
