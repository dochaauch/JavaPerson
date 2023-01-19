package profJava.lesson230118;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx1 {
    public static void main(String[] args) {
//        String s = "Mr Musk, who is being sued " +
//                "by Tesla shareholders arguing " +
//                "he manipulated the firm's share price, " +
//                "has said he cannot 29 get a fair trial in San Francisco.\n" +
//                "He wanted the trial 654 to take kjk@mgmail.ru  place in Texas " +
//                "- where he has moved klkkc@mail.com Tesla's headquarters - but that was rejected.";
        String s = "AABBBBBABdkcAABABAB";

        //Pattern -> regex
        //Matcher -> String <-> Pattern
        //Pattern pattern = Pattern.compile("\\b\\d{3}\\b");
        //Pattern pattern = Pattern.compile("\\w+@\\w+\\.(com|ru)");
        Pattern pattern = Pattern.compile("AB{2,}");

        Matcher matcher = pattern.matcher(s);

        List<String> list = new ArrayList<>();
        while (matcher.find()) {
            list.add(matcher.group());
        }

    }
}
