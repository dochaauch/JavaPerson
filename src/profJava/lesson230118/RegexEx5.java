package profJava.lesson230118;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx5 {
    public static void main(String[] args) {
        //1236 5478 9654 1258 12/54 (655)
        String card = "123654789654125812546558";
        Pattern pattern = Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");
        Matcher matcher = pattern.matcher(card);
        String cardString = matcher.replaceAll("$1 $2 $3 $4 $5/$6 ($7)");
        System.out.println(cardString);

        Pattern pattern1 = Pattern.compile("(\\d{4})");
        Matcher matcher1 = pattern1.matcher(card);
        String cardString1 = matcher1.replaceAll("$1 ");
        System.out.println(cardString1);
        System.out.println(matcher1);
    }
}
