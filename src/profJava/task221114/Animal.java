package profJava.task221114;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }
    public void voice(){
        System.out.printf("%s voice%n", name);
    }
    public void walk() {
        System.out.printf("%s walks on paws%n", name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
