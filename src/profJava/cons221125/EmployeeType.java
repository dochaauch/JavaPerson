package profJava.cons221125;

public enum EmployeeType {
    FULL_TIME(1),
    PART_TIME(2),
    REMOTE(3);

    private int value;

    EmployeeType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
