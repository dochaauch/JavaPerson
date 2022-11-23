package profJava.cons221118;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Tree birch = new BirchTree (10, 20);
        Tree oak = new OakTree(20, 22);

        birch.growth();
        oak.growth();

        System.out.println("birch: " + birch.getTreeSize());
        System.out.println("oak: " + oak.getTreeSize());

        List<Tree> trees = new ArrayList<Tree>();
        trees.add(birch);
        trees.add(oak);

        for (int i = 0; i < 10; i++) {
            for (Tree tree : trees) {
                tree.growth();
                if(tree instanceof TreeSound) {
                    System.out.println(((TreeSound) tree).getSound());
                }
            }
        }
        System.out.println("birch: " + birch.getTreeSize());
        System.out.println("oak: " + oak.getTreeSize());
    }
}
