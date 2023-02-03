package profJava.cons230127;

import java.util.Arrays;
import java.util.List;

import static org.apache.commons.lang3.StringUtils.isNumeric;

public class Parser {
    public static List<Integer> parse(String s) throws InvalidLineException {
        List<Integer> listOfInteger;
        if(checkingLine(s)) {
            listOfInteger = Arrays.stream(s.split("\\s+"))
                    .filter(e -> e.length()>0)
                    .map(Integer::parseInt)
                    .toList();
        } else {
            throw new InvalidLineException("Not valid line!");
        }
        return listOfInteger;
    }

    private static boolean checkingLine(String string) {
        boolean isNum = true;
        var array = Arrays.stream(string.split("\\s+"))
                .filter(e -> e.length()>0)
                .toList();
        for (String s: array) {
            if(!isNumeric(s)) {
                isNum = false;
                break;
            }
        }
        return isNum;
    }
}
