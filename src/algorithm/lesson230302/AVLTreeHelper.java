package algorithm.lesson230302;

import static java.lang.Math.max;

public final class AVLTreeHelper {

    private AVLTreeHelper() {

    }

    public static <T> int getHeight(AVLNode<T> node) {
        return node == null ? 0 : node.getHeight();
    }

    public static <T> int getBalance(AVLNode<T> node) {
        if (node == null) {
            return 0;
        }
        return getHeight(node.getLeft()) - getHeight(node.getRight());
    }

    // returns new root
    public static <T> AVLNode<T> rotateLeft(AVLNode<T> node) {
        // turn left child to become node parent
        // reassign right child to left
        AVLNode<T> leftChild = node.getLeft();
        AVLNode<T> tmp = leftChild.getRight();

        leftChild.setRight(node);
        node.setLeft(tmp);

        // update heights
        node.setHeight(max(
                getHeight(node.getLeft()),
                getHeight(node.getRight()) + 1));
        leftChild.setHeight(max(
                getHeight(leftChild.getLeft()),
                getHeight(leftChild.getRight()) + 1)
        );

        // return result
        return leftChild;
    }

    public static <T> AVLNode<T> rotateRight(AVLNode<T> node) {
        // save nodes
        AVLNode<T> rightChild = node.getRight();
        AVLNode<T> tmp = rightChild.getLeft();

        // do turn
        rightChild.setLeft(node);
        node.setRight(tmp);

        // update heights
        node.setHeight(max(
                getHeight(node.getLeft()),
                getHeight(node.getRight()) + 1));

        rightChild.setHeight(max(
                getHeight(rightChild.getLeft()),
                getHeight(rightChild.getRight()) + 1)
        );

        return rightChild;
    }

    public static <T> void printTree(AVLNode<T> node) {
        if (node != null) {
            printTree(node.getLeft());
            System.out.println(node);
            printTree(node.getRight());
        }
    }

    public static <T> AVLNode<T> rotateRightMy(AVLNode<T> node) {
        //turn right child to become node parent
        //reassign left child to right
        AVLNode<T> rightChild = node.getRight();
        AVLNode<T> tmp = rightChild.getLeft();

        rightChild.setLeft(node);
        node.setRight(tmp);

        //update heights
        int nodeLeftSubTreeHeight = getHeight(node.getLeft()) + 1;
        int nodeRightSubTreeHeight = getHeight(rightChild.getRight());
        node.setHeight(Math.max(nodeLeftSubTreeHeight, nodeRightSubTreeHeight));
        rightChild.setHeight(Math.max(
                getHeight(rightChild.getLeft()) + 1,
                getHeight(rightChild.getRight())));

        //return result
        return rightChild;
    }
}




