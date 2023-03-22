package algorithm.lesson230302;

import static algorithm.lesson230302.AVLTreeHelper.printTree;

public class Main {

    public static void main(String[] args) {
        AVLTree<String> tree = new AVLTree<>();

        int[] keys = {10, 2, 23, 1, 7, 13, 35, 11, 15, 44};


        for (int i = 0; i < keys.length; i++) {
            tree.insert(keys[i], "data"+ i);
        }

        System.out.println("BEFORE INSERT");
        printTree(tree.getRoot());

        System.out.println();

        tree.insert(55, "Extra");

        System.out.println("AFTER INSERT");
        printTree(tree.getRoot());
    }


}
