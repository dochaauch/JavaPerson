package profJava.lesson221221;

import java.util.stream.Stream;

public class Test7 {
    public static void main(String[] args) {
        int[] test = {1,1,1,2,2,2,3,4,5,6,6,6,7,2,4,1};
        //Arrays.stream(arr) == stream;
        Stream<Integer> stream =  Stream.of(1,1,1,2,2,2,3,4,5);
        Stream<Integer> strea1 = Stream.of(6,6,6,7,2,4,1);

        //Arrays.stream(test) == integerStream
        Stream<Integer> integerStream = Stream.concat(stream, strea1);
        //integerStream.forEach(System.out::println);

        //distinct()
        //integerStream.distinct().forEach(System.out::print);

        //count
        //System.out.println(integerStream.count());
        //System.out.println(integerStream.distinct());

        //peek
        //System.out.println(integerStream.distinct().peek(System.out::println).count());
    }
}
