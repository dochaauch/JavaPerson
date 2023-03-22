package algorithm.lesson230302;

import static algorithm.lesson230302.AVLTreeHelper.getHeight;

public class AVLTree<T> {
    private AVLNode<T> root;

    public AVLNode<T> insert(int key, T data) {
        root = insert(key, data, root);
        return root;
    }

    public AVLNode<T> getRoot() {
        return root;
    }

    public AVLNode<T> insert(int key, T data, AVLNode<T> node) {
        if (node == null) {
            AVLNode<T> avlNode = new AVLNode<>(key, data);
            avlNode.setHeight(1);
            return avlNode;
        }

        if (key < node.getKey()) {
            AVLNode<T> newSubTreeRoot = insert(key, data, node.getLeft());
            node.setLeft(newSubTreeRoot);
        }
        else if (key > node.getKey()) {
            AVLNode<T> newSubTreeRoot = insert(key, data, node.getRight());
            node.setRight(newSubTreeRoot);
        }

        node.setHeight(1 +
                Math.max(getHeight(node.getLeft()),
                        getHeight(node.getRight())));

        AVLNode<T> balancedSubTreeRoot = balanceTree(key, node);
        return balancedSubTreeRoot;
    }
    // insert(55, data ,AVLNode(10))
    // node = AVLNode(10), key = 55
    //      insert(55, data, AVLNode(23))
    //      node = AVLNode(23), key = 55
    //          insert(55, data, AVLNode(35))
    //          node = AVLNode(35), key = 55
    //                  insert(55, data, AVLNode(44))
    //                  node = AVLNode(44), key = 55
    //                      insert(55, data, null)
    //                      return AVLNode(55)
    //                  node = AVLNode(44), newSubTreeRoot = AVLNode(55)
    //                  AVLNode(44).setRight(AVLNode(55))
    //                  balanceTree(55, AVLNode(44))
    //                  balancedSubTreeRoot = AVLNode(44)
    //                  return AVLNode(44)
    //          node = AVLNode(35), key = 55
    //          newSubTreeRoot = AVLNode(44)
    //          AVLNode(35).setRight(AVLNode(44))
    //          balanceTree(55, AVLNode(35))
    //          balancedSubTreeRoot = AVLNode(44)
    //          return AVLNode(44)
    //      node = AVLNode(23), key = 55
    //      newSubTreeRoot = AVLNode(44)
    //      AVLNode(23).setRight(AVLNode(44))
    //      balanceTree(55, AVLNode(23))
    //      balancedSubTreeRoot = AVLNode(23)
    //      return AVLNode(23)
    // node = AVLNode(10), key = 55
    // newSubTreeRoot = AVLNode(23)
    // AVLNode(10).setRight(AVLNode(23))
    // balanceTree(55, AVLNode(10))
    // balancedSubTreeRoot = AVLNode(10)
    // return AVLNode(10)

    private AVLNode<T> balanceTree(int key, AVLNode<T> node) {
        int balance = AVLTreeHelper.getBalance(node);

        if (balance > 1) {
            // LL
            if (key < node.getLeft().getKey()) {
                return AVLTreeHelper.rotateLeft(node);
            }
            // LR
            else if (key > node.getLeft().getKey()) {
                AVLNode<T> tmpRoot = AVLTreeHelper.rotateRight(node.getLeft());
                node.setLeft(tmpRoot);
                return AVLTreeHelper.rotateLeft(node);
            }
        }
        if (balance < -1) {
            // RR
            if (key > node.getRight().getKey()) {
                return AVLTreeHelper.rotateRight(node);
            }
            // RL
            else if (key < node.getRight().getKey()) {
                AVLNode<T> tmpRoot = AVLTreeHelper.rotateLeft(node.getRight());
                node.setRight(tmpRoot);
                return AVLTreeHelper.rotateRight(node);
            }
        }
        return node;
    }
}
