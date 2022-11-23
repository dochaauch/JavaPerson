package profJava.task221123;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ImplRangeEx {
    public static void main(String[] args) {
        for (int i : Range.fromTo(0, 99)) {
            System.out.println(i);
        }

    }
    public static class Range implements Iterable<Integer> {
        //два поля
        //конструктор с этими полями
        //переписать методы
        private int from;
        private int to;

        public Range(int from, int to) {
            this.from = from;
            this.to = to;
        }

        public static Range fromTo(int from, int to) {
            return new Range(from, to);
        }


        @Override
        public Iterator<Integer> iterator() {
            return new RangeIterator(this);
        }

    }

    static class RangeIterator implements Iterator<Integer> {
        // некое поле
        // конструктор с этим полем
        //переписать методы
        private Range range;
        private int pointer;

        public RangeIterator(Range range) {
            this.range = range;
            this.pointer = range.from;
        }

        @Override
        public boolean hasNext() {
            return pointer < range.to;  // включая to
        }

        @Override
        public Integer next() {
            if (!hasNext()){
                throw new NoSuchElementException();
            }
            return pointer++; // включая to
        }
    }
}
