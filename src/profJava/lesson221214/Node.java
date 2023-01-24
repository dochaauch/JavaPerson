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

    //todo ++
    private static Node search(Node node, int value){
        if(!isNodeExist(node)) {
            return null;
        }
        if(node.value == value) {
            return node;
        }
        else if (value < node.value) {
            return search(node.left, value);
        } else {
            return search(node.right, value);
        }
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


    //++
    private static void postOrderTraversal(Node node){
        if(!isNodeExist(node)) {
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.println("[ " + node + " ]");
    }

    //++
    private static void directOrderTraversal(Node node){
        if(!isNodeExist(node)) {
            return;
        }
        System.out.println("[ " + node + " ]");
        directOrderTraversal(node.left);
        directOrderTraversal(node.right);
    }


    // todo class ++
    private static void moveNode(Node toNode, Node fromNode) {
        toNode.value = fromNode.value;
        toNode.left = fromNode.left;
        toNode.right = fromNode.right;
    }

    // todo class++
    private static int getChildrenCount(Node node) {
        int count = 0;
        if (isNodeExist(node.left)) {
            count++;
        }
        if (isNodeExist(node.right)) {
            count++;
        }
        return count;
    }
}
