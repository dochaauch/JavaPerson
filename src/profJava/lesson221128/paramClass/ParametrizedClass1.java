package profJava.lesson221128.paramClass;

public class ParametrizedClass1 {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("s", 45);
        System.out.println(pair);

    }
}

class Pair<v1, v2>{
    private v1 value1;
    private v2 value2;

    public Pair(v1 value1, v2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public v1 getValue1() {
        return value1;
    }

    public v2 getValue2() {
        return value2;
    }
}