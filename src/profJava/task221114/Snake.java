package profJava.task221114;

public class Snake extends Animal{

    public Snake(String name) {
        super(name);
    }

    @Override
    public void voice(){
        System.out.printf("%s shhhhh Bandarlog%n", name); // %n перевод строки
    }

    @Override
    public void walk() {
        System.out.printf("%s crawl%n", name);
    }

    @Override
    public String toString() {
        return "Snake{" +
                "name='" + name + '\'' +
                '}';
    }

}
