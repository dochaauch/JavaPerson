package profJava.cons221223;

import java.util.function.Consumer;
import java.util.function.Function;

public class App {
    public static void main(String[] args) {
        Function<String, Boolean> f = e -> Boolean.valueOf( e );
        System.out.println(f.apply("TRUE"));
        Function<String, Boolean> f1 = new Function<String, Boolean>() {
            @Override
            public Boolean apply(String s) {
                return Boolean.valueOf(s);
            }
        };
        System.out.println(f.apply("False"));
        StringToBoolean f2 = new StringToBoolean();
        System.out.println(f2.apply("some"));

        Function<String, Boolean> f3 = Boolean::valueOf;
        System.out.println(f3.apply("true"));

        Consumer<String> f4 = (String x) -> System.out.println(x);
        f4.accept("The sky is blue");

        Consumer<String> f5 = System.out::println;
        f5.accept("birds are dancing");

        Function<String, String> f6 = (String x) -> x.toLowerCase();
        System.out.println(f6.apply("JUst fine"));

        Function<String, String> f7 = String::toLowerCase;
        System.out.println(f7.apply("JUst fine"));

        Function<String, Integer> f8 = x -> new Integer(x);
        System.out.println(f8.apply("4"));

        Function<String, Integer> f9 = Integer::new;
        System.out.println(f9.apply("9"));
    }
    static class StringToBoolean implements Function<String, Boolean>{
        @Override
        public Boolean apply(String s) {
            return Boolean.valueOf(s);
        }
    }
}
