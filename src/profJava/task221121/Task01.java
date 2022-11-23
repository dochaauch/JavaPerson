package profJava.task221121;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Task01 {

    public static void main(String[] args) {
        String[] strings = {"January", "February", "March"};

        ArrayIterator<String> iterator = new ArrayIterator<>(strings);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        List someList = List.of("January", "February", "March");
        Iterator<String> iter = someList.iterator();
        while (iter.hasNext()) {
            String s = iter.next();
            System.out.println(s);
            if (s.equals("February")) {
                iter.remove();
            }
        }
        System.out.println("-----------");

        iter = someList.iterator();
        iter.forEachRemaining(System.out::println);
    }

    static class ArrayIterator<TYPE> implements Iterator<TYPE> {
        private TYPE[] arr;
        private int pointer = 0;

        public ArrayIterator(TYPE[] arr) {
            this.arr = arr;
        }

        @Override
        public boolean hasNext() {
            return pointer < arr.length;
        }

        @Override
        public TYPE next() {
            if(!hasNext()){
                throw new NoSuchElementException();
            }
            return arr[pointer++];
        }
    }
}
