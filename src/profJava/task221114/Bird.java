package profJava.task221114;

public class Bird extends Animal{

    public Bird(String name) {
        super(name);
    }

    @Override
    public void voice(){
        System.out.printf("%s check-cherek%n", name);
    }

    public void fly(){
        System.out.printf("%s fly%n", name);
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                '}';
    }
}
