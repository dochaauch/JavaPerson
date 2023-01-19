package profJava.lesson230118;

import java.util.regex.Pattern;

public class RegexEx4 {
    static void checkIp(String ip){
        String regex = "255\\.255\\.\\d{3}\\.\\d{2}";
        System.out.println(ip + " is OK? " + Pattern.matches(regex, ip));
    }

    public static void main(String[] args) {
        String ip1 = "255.255.120.10";
        String ip2 = "985.254.100.11";

        checkIp(ip1);
        checkIp(ip2);
    }


}
