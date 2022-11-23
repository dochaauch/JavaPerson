package basicJava.lesson221107;

public class Calc {
    int plus(int a, int b) {
        return a+b;
    }
    String getSmth(int a) {
        String res1 = "!";
        String res2 = "?";
        if(a %2 ==0) {
            return res1;
        }
        return res2;
    }
}
