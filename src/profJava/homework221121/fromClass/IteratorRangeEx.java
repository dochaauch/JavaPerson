//package profJava.homework221121.fromClass;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//import java.util.function.Consumer;
//
///* 3***. Написать класс, который реализует интерфейс Iterable => чтобы появилась
//* возможность задавать диапазон вывода цифр*/
//public class IteratorRangeEx {
//    public static void main(String[] args) {
//        for (int i : Range.fromTo(0, 99)) {
//            System.out.println(i);
//        }
//
//    }
//    private static class Range implements Iterable<Integer> {
//        //два поля
//        //конструктор с этими полями
//        //переписать методы
//        //private static ArrayList<Integer> arrayList;
//        private int fromValue;
//        private int toValue;
//
//
//        public Range() {
//
//            //List<Integer> arrayList = new ArrayList<>();
//            //arrayList = Range.fromTo(this.fromValue, this.toValue);
//        }
//
//        public static List<Integer> fromTo(int fromValue, int toValue) {
//            List<Integer> arrayList = new ArrayList<>();
//            for (int j = fromValue; j < toValue+1; j++) {
//                arrayList.add(j);
//            }
//            return arrayList;
//        }
//
//
//        @Override
//        public Iterator<Integer> iterator() {
//            return new Iterator<Integer>(arrayList);
//        }
//    }
//
//    public static class Iterator<Integer> implements java.util.Iterator<Integer> {
//        // некое поле
//        // конструктор с этим полем
//        //переписать методы
//        //public java.util.Iterator<Integer> iterator;
//        private List<Integer> arrayList;
//        private int ind = 0;
//
//
//        public Iterator(ArrayList<Integer> arrayList) {
//            this.arrayList = arrayList;
//        }
//
//        @Override
//        public boolean hasNext() {
//            return ind < this.arrayList.size();
//        }
//
//        @Override
//        public Integer next() {
//            return this.arrayList.get(ind++);
//        }
//
////        @Override
////        public void remove() {
////            java.util.Iterator.super.remove();
////        }
////
////        @Override
////        public void forEachRemaining(Consumer<? super Integer> action) {
////            java.util.Iterator.super.forEachRemaining(action);
////        }
//
//    }
//}
