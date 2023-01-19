package profJava.lesson230118;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx2 {
    public static void main(String[] args) {
        String s = "ASFF ASDFGA A7FDFG123HJK7LFAWFA явло";

        //Pattern pattern = Pattern.compile("ASDF"); // вся подстрока
        //Pattern pattern = Pattern.compile("[ASDF]"); //любой из этих символов
        //Pattern pattern = Pattern.compile("A[SD]F"); //A(или S или D)F
        //Pattern pattern = Pattern.compile("A[A-Z]F"); //A(любая буква)F, диапазон
        //Pattern pattern = Pattern.compile("A[A-Z1-5]F"); //A(любая буква)F
        //Pattern pattern = Pattern.compile("A[^A-Z1-5]F"); //отрицание
        //Pattern pattern = Pattern.compile("A(S|7)F"); //или
        //Pattern pattern = Pattern.compile("ASDF."); //любой один символ
        //Pattern pattern = Pattern.compile("ASDF"); //любой один символ
        Pattern pattern = Pattern.compile("\\w{2}");
        // \d одна цифра /D одна не цифра
        // \w буква,цифра _
        // \s пробел

        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
