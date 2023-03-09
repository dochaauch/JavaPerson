package algorithm.lesson230223.enhanced;

public class EnhancedBinaryTree<T> {
    private EnhancedNode<T> root;

    public EnhancedNode<T> find(Integer key) {
        if (root == null) {
            return null;
        }
        // start from root
        EnhancedNode<T> current = root;
        // while node is not found
        while (!key.equals(current.getKey())) {
            // compare at each step value with value of current node
            //if less go to left subtree

            int compareResult = key.compareTo(current.getKey());
            if (compareResult < 0) {
                current = current.getLeft();
            }
            // if more go to right subtree
            else if (compareResult > 0) {
                current = current.getRight();
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }
}
