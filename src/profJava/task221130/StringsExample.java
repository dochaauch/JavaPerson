package profJava.task221130;

import java.sql.SQLOutput;
import java.util.Arrays;

public class StringsExample {
    public static void main(String[] args) {
        //stringAndStringComparison();

        //stringBuffer();
        //concatExamples();

        String s = "I love coding klgkylknfg very much";
        System.out.println("Str length: " + s.length());
        System.out.println(s.charAt(2));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.getBytes());
        System.out.println(s.contains("lo"));
        System.out.println(s.compareTo("Java"));
        System.out.println(s.endsWith("ch"));
        System.out.println(s.startsWith("I l"));
        System.out.println(s.substring(7,13));
        int startIndex = s.indexOf("coding");
        int endIndex = s.indexOf("very") + 4;
        System.out.println(s.substring(startIndex, endIndex));

        String[] arr = s.split("\\s");
        System.out.println(Arrays.toString(arr));

        String[] arr1 = s.split("o");
        System.out.println(Arrays.toString(arr1));

        
    }

    private static void concatExamples() {
        int a = 10;
        System.out.println("Str" + 10 +14 +5);
        System.out.println("Str" + (10 +14 +5));
        System.out.println(10 +14 +5 + "str");
        System.out.println("Str" + a++);
        System.out.println("Str" + ++a);
    }

    private static void stringBuffer() {
        StringBuffer s = new StringBuffer("Hello world1");
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 500_000; i++) {
            s.append(i);
        }
        long time =  System.currentTimeMillis() - startTime;
        System.out.println("String time: " + time);
    }

    private static void stringAndStringComparison() {
        String s = "Hello world!";
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 500_000; i++) {
            s += i;
        }
        long time =  System.currentTimeMillis() - startTime;
        System.out.println("String time: " + time);

        StringBuilder sb = new StringBuilder("Hello world!");
        startTime = System.currentTimeMillis();

        for (int i = 0; i < 500_000; i++) {
            sb.append(i);
        }
        time =  System.currentTimeMillis() - startTime;
        System.out.println("String Builder time: " + time);

        System.out.println("Strings are equal: " + s.equals(sb.toString()));
    }
}
