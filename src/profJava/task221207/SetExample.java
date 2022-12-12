package profJava.task221207;

import lombok.*;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        //Iterable => Collection => List/Set/Queue
        Set<String> months = new TreeSet<>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");

        System.out.println(months);
        months.addAll(List.of("March", "April", "May", "June"));

        months.forEach(System.out::println);
        months.forEach(s -> System.out.println(s+ " month"));



        Set<Box> boxes = new TreeSet<>((b1, b2) ->b1.getHeight() * b1.getWidth() - b2.getHeight()*b2.getWidth());
        boxes.add(new Box(1,1));
        boxes.add(new Box(2,1));
        boxes.add(new Box(1,1));

        System.out.println(boxes);

        //Map<String, String> map = new HashMap<>();
        //Map<String, String> map = new LinkedHashMap<>();
        Map<String, String> map = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });



        map.put("One", "January");
        map.put("Two", "February");
        map.put("Three", "March");
        map.putIfAbsent("Two", "May");
        map.remove("Two", "February");

        System.out.println(map);

    }

    @Getter
    @Setter
    @AllArgsConstructor
    @ToString

    static class Box{
        private int height;
        private int width;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Box box = (Box) o;
            return height == box.height && width == box.width;
        }

        @Override
        public int hashCode() {
            return Objects.hash(height, width);
        }
    }
}
