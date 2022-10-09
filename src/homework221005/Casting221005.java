package homework221005;

import java.sql.SQLOutput;

public class Casting221005 {
    //byte->int, int-byte, long->short
    static byte b =  127;
    static int i = 5673;
    static long l = 3345668;
    static short s = -32768;
    static char c = 65535;
    static String str = "Ar";
    static float f = 2.543345434433f;
    static double d = 3.4432776634788;

    public static void main(String[] args) {
        int a1 = b;
        System.out.println("b=" + b + " => a1="+ a1);
        System.out.println("тип a1 " + ((Object)a1).getClass().getName());
        byte b1 = (byte) i;
        System.out.println("i=" + i + " => b1="+ b1);
        System.out.println("тип b1 " + ((Object)b1).getClass().getName());
        short s1 = (short) l;
        System.out.println("l=" + l + " => s1="+ s1);
        System.out.println("тип s1 " + ((Object)s1).getClass().getName());
        long l1 = s;
        System.out.println("s=" + s + " => l1="+ l1);
        System.out.println("тип l1 " + ((Object)l1).getClass().getName());
        String str1 = String.valueOf(c);
        System.out.println("c=" + c + " => str1="+ str1);
        System.out.println("тип str1 " + ((Object)str1).getClass().getName());
        char c1 = str.charAt(1);
        System.out.println("str=" + str + " => c1="+ c1);
        System.out.println("тип c1 " + ((Object)c1).getClass().getName());
        double d1 = f;
        System.out.println("f=" + f + " => d1="+ d1);
        System.out.println("тип d1 " + ((Object)d1).getClass().getName());
        float f1 = (float) d;
        System.out.println("d=" + d + " => f1="+ f1);
        System.out.println("тип f1 " + ((Object)f1).getClass().getName());
    }
}
