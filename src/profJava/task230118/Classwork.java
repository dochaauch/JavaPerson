package profJava.task230118;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Classwork {
    public static void main(String[] args) {
        //filterUsingRegex();

        String rawData = "AaaaaaaaBbbbbbbb1111CccccccDddddd111112222DddFffffff3333Eeeee4444Ff";
        Pattern pattern = Pattern.compile("([A-Z][a-z]+)([A-Z][a-z]+)(\\d+)");
        Matcher matcher = pattern.matcher(rawData);
        System.out.println(matcher);
        List<String> list = new ArrayList<>();
        while (matcher.find()) {
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
            System.out.println(matcher.group(3));
            String s1 =  (matcher.group(1) + " " + matcher.group(2) + " " + matcher.group(3));
            list.add(s1);
            System.out.println();
        }

        System.out.println(list);

        //String[] arr = rawData.split("\\d+");
        //System.out.println(Arrays.toString(arr));

    }

    private static void filterUsingRegex() {
        String rawData = "aaaaa 111111 kjlödfmb jkööksee 222 3333333";
        String[] rawArray = rawData.split("\\s");
        List<String> words = new ArrayList<>();
        List<Long> numbers = new ArrayList<>();
        for (String element : rawArray) {
            if(element.matches("\\d+")) {
                numbers.add(Long.parseLong(element));
            } else {
                words.add(element);
            }
        }
        System.out.println(Arrays.toString(rawArray));
        System.out.println("Words: " + words);
        System.out.println("\nNumbers: " + numbers);
    }
}
