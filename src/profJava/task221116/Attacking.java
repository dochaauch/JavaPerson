package profJava.task221116;

public interface Attacking {
    public static final String SOME_FIELD = "SOME";
    void attack();

    default void doDefault() {
        System.out.println("DEFAULT!!!!");
    };

    static void doStatic() {
        System.out.println("STATIC");
    }
    private void doPrivate() {
        System.out.println("PRIVATE");
    }
}
