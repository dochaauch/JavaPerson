package profJava.task221123;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;
import java.util.Objects;

public class CompareEx {
    public static void main(String[] args) {
//        List<Box> boxes = new ArrayList<>(List.of(
//                new Box(4,5),
//                new Box(2,3),
//                new Box(10,10)
//        ));
        Box[] boxes = {
                new Box(4,5, "A"),
                new Box(2,3, "AAAAAAAAAAAAAAAAAAAA"),
                new Box(10,10,"jkld"),
                new ShoeBox(2, 2, "shoe"),
                new FurnitureBox(20,20, "lkjlklsdf")
        };

        System.out.println(Arrays.toString(boxes));
        Arrays.sort(boxes);
        System.out.println(Arrays.toString(boxes));
    }

    @AllArgsConstructor
    @Getter
    @Setter
    @ToString
    static class Box implements Comparable<Box>{
        private int height;
        private int width;
        private String name;


        @Override
        public int compareTo(Box o) {
            return height * width + name.length() - o.height * o.width -o.name.length();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Box box)) return false;
            return height == box.height && width == box.width;
        }

        @Override
        public int hashCode() {
            return Objects.hash(height, width);
        }
    }

    static class ShoeBox extends Box {
        public ShoeBox(int height, int width, String name) {
            super(height, width, name);
        }
    }

    static class FurnitureBox extends Box {
        public FurnitureBox(int height, int width, String name) {
            super(height, width, name);
        }
    }
}
