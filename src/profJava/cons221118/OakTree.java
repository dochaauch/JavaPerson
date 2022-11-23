package profJava.cons221118;

public class OakTree extends Tree implements TreeSound{

    public OakTree(Integer xPos, Integer yPos) {
        super(xPos, yPos);
    }

    @Override
    public void growth() {
        sizeTree += 20;
    }

    @Override
    public Freq getSound() {
        return Freq.LOW;
    }
}
