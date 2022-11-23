package profJava.task221114;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void voice(){
        System.out.printf("%s wooh%n", name);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
