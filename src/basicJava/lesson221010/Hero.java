package basicJava.lesson221010;

public class Hero {
    private int age;
    private String name;

    Weapon weapon;

    public Hero(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Hero() {
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

class Main {
    public static void main(String[] args) {
        Hero p1 = new Hero();
    }
}
