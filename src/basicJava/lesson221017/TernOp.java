package basicJava.lesson221017;

public class TernOp {
    int a;
    public static String get(int a){
         return a > 10 ? "More than 10" : "Less";
    }

    public static void main(String[] args) {
        System.out.println(get(55));
    }
}
