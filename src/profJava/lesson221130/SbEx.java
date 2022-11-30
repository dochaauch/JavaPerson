package profJava.lesson221130;

public class SbEx {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Hello");
        System.out.println(builder);
        builder.append("!");
        builder.append("?");
        System.out.println(builder);

        builder.append("*")
                .append("^^")
                .append("##");
        System.out.println(builder);

        StringBuffer stringBuffer = new StringBuffer("StringBuffer");
        //String sq = String.format("%3d  \t Hello %-12s \t %-5s \t %,.1f", 1, "Mikhail", "Jegorov", 123_456);
        //System.out.println(sq);
    }
}
