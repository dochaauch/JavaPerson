package profJava.lesson230118;

public class RegegEx3 {
    public static void main(String[] args) {
        String s = "The cancelled Chinese Grand Prix will not be replaced this year.\n" +
                "\n" +
                "It was announced in December that the 2023 race was called off because of \"ongoing difficulties\" with Covid in China.\n" +
                "\n" +
                "F1 has rejected a request from the Chinese organisers for the race to be reinstated and will not replace its 23 April date with another event.";
        System.out.println(s.split("\\Z"));
        //System.out.printf();
    }
}
