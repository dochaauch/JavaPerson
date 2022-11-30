package profJava.lesson221128.paramClass;

public class ParametrizedClassEx {
    public static void main(String[] args) {
//        Info<String> info = new Info<>("!!!!");
//        System.out.println(info);
//        String s = info.getValue();
//        System.out.println(s);
//
//        Info<Integer> info1 = new Info<>(11);
//        System.out.println(info1);
        //Integer s1 = info.getValue();
    }

//    public void get(Info<String> info) {
//        String s = info.getValue();
//    }

//    public void get(Info<Integer> info) {
//        String s = info.getValue();
//    }
}

class Info<T extends Number & Inter & Supers> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Info: " + value;
    }
}

interface Inter {

}

interface Supers{

}

class Parent {
//    public void get(Info<Integer> info) {
//        Integer s = info.getValue();
//    }
}

class Child extends Parent{
//    public void get(Info<String> info) {
//        String s = info.getValue();
//    }
}