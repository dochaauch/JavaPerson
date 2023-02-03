package profJava.lesson230201;

public class Ex4 {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("!!!!!")).start();
    }
}
