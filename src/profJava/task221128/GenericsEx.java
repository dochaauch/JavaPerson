package profJava.task221128;

public class GenericsEx {
    public static void main(String[] args) {
        //simpleBox();
        //genericEx();


    }

    private static void genericEx() {
        BoxGeneric<Integer> boxInt1 = new BoxGeneric(100500);
        BoxGeneric<Integer> boxInt2 = new BoxGeneric(500100);

        BoxGeneric<String> boxString1 = new BoxGeneric("Hello");
        BoxGeneric<String> boxString2 = new BoxGeneric("World");

        //Many strings of code...
        //boxInt2.setObj("Java"); // внезапно может оказаться такая ситуация, а у нас должны  быть числа
        //Many strings of code...

        int sum = boxInt2.getObj() + boxInt1.getObj();
        System.out.println(boxInt1.getClass().getName());
    }

    private static void simpleBox() {
        Box boxInt1 = new Box(100500);
        Box boxInt2 = new Box(500100);

        Box boxString1 = new Box("Hello");
        Box boxString2 = new Box("World");

        //Many strings of code...
        boxInt2.setObj("Java"); // внезапно может оказаться такая ситуация, а у нас должны  быть числа
        //Many strings of code...

        //int sum = boxInt1.getObj() + boxInt2.getObj();
        if(boxInt2.getObj() instanceof Integer &&  boxInt1.getObj() instanceof Integer) {
            int sum = (Integer) boxInt1.getObj() + (Integer) boxInt2.getObj();
            System.out.println(sum);
        } else {
            System.out.println("Error");
        }
    }
}
