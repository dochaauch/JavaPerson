package profJava.lesson230123;

public class MR1 {
    public static void main(String[] args) {
        me2(MR1::me1);
        me2(() -> me1());
        //me2(() -> System.out.println("----"));

        System.out.println("****");
    }

    public static void me1(){
        System.out.println("----");
    }

    public static void me2(Inter1 inter1){
        System.out.println("++++");
        inter1.set();
    }
}

@FunctionalInterface
interface Inter1 {
    void set();
}
