package basicJava.lesson221012;

public class Parent {
    String name;
    int age;

    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void get(String name) {
        System.out.println(name);
    }
}

class Child extends Parent{
    public Child(String name, int age) {
        super(name, age);
    }

    public static void main(String[] args) {
        Parent parent = new Parent("JJ", 5);
    }
}