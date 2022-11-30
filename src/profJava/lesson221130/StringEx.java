package profJava.lesson221130;

public class StringEx {
    public static void main(String[] args) {
        String a = "A";
        String b = "A";
        String c = new String("A");

        System.out.println(a==b);
        System.out.println(a==c);

        String s = "Java";
        s.length();
        s.split("");
        //System.out.println(s.getBytes());
        System.out.println(s.hashCode());
        char[] a1 = s.toCharArray();
        System.out.println(5+5+"5" +5+5);
    }
}
