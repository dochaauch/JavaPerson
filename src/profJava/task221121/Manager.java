package profJava.task221121;

public class Manager {
    protected String name;
    protected PositionType position;

    public Manager(String name) {
        this.name = name;
        this.position = PositionType.MANAGER;
    }
}
