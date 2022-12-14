package profJava.lesson221214;

public class Node {
    //Map<String, String> map = new TreeMap<>();
    public Integer value;
    public Node left;
    public Node right;

    private static boolean isNodeExist(Node node) {
        return node != null && node.value != null;
    }

    private static void createNode(Node node, int value) {
        node.left = new Node();
        node.right = new Node();
        node.value = value;
    }

    private static void insert(Node node, int value){
        if(!isNodeExist(node)) {
            createNode(node, value);
        } else if (value < node.value) {
            insert(node.left, value);
        } else {
            insert(node.right, value);
        }
    }

    //todo
    private static Node search(Node node, int value){
        return null;
    }

    private static Node getMin(Node node) {
        if(!isNodeExist(node)) {
            return null;
        }
        if((!isNodeExist(node.left))) {
            return node;
        }
        return getMin(node.left);
    }

    private static Node getMax(Node node) {
        if(!isNodeExist(node)) {
            return null;
        }
        if((!isNodeExist(node.right))) {
            return node;
        }
        return getMax(node.right);
    }

    private static void inOrderTraversal(Node node) {
        if(!isNodeExist(node)) {
            return;
        }
        inOrderTraversal(node.left);
        System.out.println("[ " + node + " ]");
        inOrderTraversal(node.right);
    }


    private static void postOrderTraversal(Node node){

    }

    private static void directOrderTraversal(Node node){

    }


    // todo class
    private static void moveNode(Node toNode, Node fromNode){

    }

    // todo class
    private static int getChildrenCount(Node node) {
        return 0;
    }
}
