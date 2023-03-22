package algorithm.lesson230302;

public class AVLNode<T> {

    private AVLNode<T> left;
    private AVLNode<T> right;
    private int height;
    private int key;
    private T data;

    public AVLNode(int key, T data) {
        this.key = key;
        this.data = data;
    }

    public void setLeft(AVLNode<T> left) {
        this.left = left;
    }

    public void setRight(AVLNode<T> right) {
        this.right = right;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public AVLNode<T> getLeft() {
        return left;
    }

    public AVLNode<T> getRight() {
        return right;
    }

    public int getHeight() {
        return height;
    }

    public int getKey() {
        return key;
    }

    public T getData() {
        return data;
    }

    @Override
    public String toString() {
        return "AVLNode{" +
                "height=" + height +
                ", key=" + key +
                ", data=" + data +
                '}';
    }
}

