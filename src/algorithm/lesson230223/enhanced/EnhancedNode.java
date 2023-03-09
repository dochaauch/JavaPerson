package algorithm.lesson230223.enhanced;

public class EnhancedNode<T> {

    private int key;
    private T value;
    private EnhancedNode<T> left;
    private EnhancedNode<T> right;

    public EnhancedNode(int key, T value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public T getValue() {
        return value;
    }

    public EnhancedNode<T> getLeft() {
        return left;
    }

    public EnhancedNode<T> getRight() {
        return right;
    }

    public void setLeft(EnhancedNode<T> left) {
        this.left = left;
    }

    public void setRight(EnhancedNode<T> right) {
        this.right = right;
    }
}
