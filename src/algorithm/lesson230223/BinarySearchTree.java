package algorithm.lesson230223;

import lombok.Getter;

@Getter
public class BinarySearchTree<T extends Comparable<T>> {
    private Node<T> root;

    public Node<T> findGPT(T value) {
        //start from root
        //compare at each step value with value of current node
        //return 0 if nothing is found

        //return node containing value null, if doesn't exists
        //update class Node with public class Node<T extends Comparable<T>> implements Comparable<Node<T>>
        //and method compareTo

        Node<T> currentEnhancedNode = root;

        while (currentEnhancedNode != null) {
            int comparisonResult = value.compareTo(currentEnhancedNode.getValue());

            if (comparisonResult == 0) {
                // Found the node with the desired value
                return currentEnhancedNode;
            } else if (comparisonResult < 0) {
                // Value is smaller than current node, move to left subtree
                currentEnhancedNode = currentEnhancedNode.getLeft();
            } else {
                // Value is larger than current node, move to right subtree
                currentEnhancedNode = currentEnhancedNode.getRight();
            }
        }

        // Node with desired value not found
        return null;
    }

    public Node<T> find(T value) {
        if (root == null) {
            return null;
        }
        Node<T> current = root;
        while (!value.equals(current.getValue())) {
            int compareResult = value.compareTo(current.getValue());
            if (compareResult < 0) {
                current = current.getLeft();
            } else if (compareResult > 0){
                current = current.getRight();
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }


    //if tree is empty then new node is root
    //start with root
    //compare at each step the value with current node
    //if less, then go to left subtree
    //if more, then go to right subtree
    //if current is null, then insert node
    //if we find same value, just ignore
    public void insert(T value) {
        // if tree is empty then new node is root
        Node<T> newNode = new Node<>(value);
        if (root == null) {
            root = newNode;
        }
        else {
            // start with root
            Node<T> current = root;
            Node<T> parent;
            while (current != null) {
                parent = current;
                // compare at each step the value with current node
                int comparisonResult = value.compareTo(current.getValue());
                // if less then go to the left subtree
                if (comparisonResult < 0) {
                    current = current.getLeft();
                    // if current is null then insert node
                    if (current == null) {
                        parent.setLeft(newNode);
                    }
                }
                // if more then go to the right subtree
                else if (comparisonResult > 0) {
                    current = current.getRight();
                    // if current is null then insert node
                    if (current == null) {
                        parent.setRight(newNode);
                    }
                }
                // if we find same value, just ignore value
                else {
                    return;
                }
            }
        }
    }

    public void insertGPT(T value) {
        Node<T> newNode = new Node<>(value);
        if (root == null) {
            root = newNode;
            return;
        }
        Node<T> current = root;
        while (true) {
            int cmp = value.compareTo(current.getValue());
            if (cmp < 0) {
                if (current.getLeft() == null) {
                    current.setLeft(newNode);
                    return;
                } else {
                    current = current.getLeft();
                }
            } else if (cmp > 0) {
                if (current.getRight() == null) {
                    current.setRight(newNode);
                    return;
                } else {
                    current = current.getRight();
                }
            } else {
                // Value already exists in the tree
                return;
            }
        }
    }

    public void print() {
        if (root == null) {
            System.out.println("Tree is empty");
        }
        else {
            print(root);
            System.out.println();
        }
    }

    private void print(Node<T> node) {
        if (node != null) {
            print(node.getLeft());
            System.out.print(node.getValue() + " ");
            print(node.getRight());
        }
    }


}
