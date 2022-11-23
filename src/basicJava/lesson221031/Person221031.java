package basicJava.lesson221031;

public class Person221031 {
    String name;
    int age;

    public Person221031(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class PersonTest {
    public static void main(String[] args) {
        Person221031 person221031 = new Person221031("Konst", 33);
    }
}