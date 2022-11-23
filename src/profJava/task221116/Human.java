package profJava.task221116;

public class Human implements Moving, Attacking{
    @Override
    public void move() {
        System.out.println("Human walks!");
    }

    @Override
    public void attack() {
        System.out.println("Human shoots");
    }

    public void doSomething() {
        System.out.println("Something");
    }

}
