package profJava.lesson230123;

public class MR {
    public static void main(String[] args) {
        me(() -> System.out.println("!!!!"));

        System.out.println("****");
    }

    public static void me(Inter inter){
        System.out.println("----");
        inter.set();
    }
}

@FunctionalInterface
interface Inter {
    void set();
}
