package profJava.cons221118;

public class BirchTree extends Tree implements TreeSound{

    public BirchTree(Integer xPos, Integer yPos) {
        super(xPos, yPos);
    }

    @Override
    public void growth() {
        sizeTree += 10;
    }

    @Override
    public Freq getSound() {
        return Freq.MID;
    }
}
