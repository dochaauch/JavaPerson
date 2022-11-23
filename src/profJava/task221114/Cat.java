package profJava.task221114;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void voice(){
        System.out.printf("%s meah%n", name);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
