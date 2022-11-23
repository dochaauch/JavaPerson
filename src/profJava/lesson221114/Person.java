package profJava.lesson221114;

public class Person {
    void walk(){};

    public static void main(String[] args) {

    }
}

class Person1 extends Person  {

}

class Person2 extends Person implements Flyable{

    @Override
    public void fly() {

    }
}

interface Flyable {
    void fly();
}
