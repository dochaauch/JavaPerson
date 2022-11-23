package profJava.cons221118;

public abstract class Tree {
    public Integer xPos;
    public Integer yPos;
    protected Integer sizeTree;

    public Tree(Integer xPos, Integer yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
        sizeTree =  0;
    }
    public int getTreeSize(){
        return sizeTree;
    }
    public abstract void growth();
}
