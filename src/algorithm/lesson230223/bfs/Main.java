package algorithm.lesson230223.bfs;

import algorithm.lesson230223.BinarySearchTree;
import algorithm.lesson230223.Node;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

    }

    public static <T extends Comparable<T>> void bfs(BinarySearchTree<T> tree) {
        // we start from root
        // for each child we collect its children and process (print)
        Queue<Node<T>> queue = new LinkedList<>();
        queue.add(tree.getRoot());
        while (!queue.isEmpty()) {
            Node<T> node = queue.poll();
            if (node.getLeft() != null) {
                queue.add(node.getLeft());
            }
            if (node.getRight() != null) {
                queue.add(node.getRight());
            }
            System.out.println(node.getValue());
        }
    }
}
