package profJava.lesson230215.synch.semaphor;

import java.util.concurrent.Semaphore;

public class SEMAPH {
    public static void main(String[] args) {
        Semaphore box = new Semaphore(2); // не больше двух потоков
        new Person("User1", box);
        new Person("User2", box);
        new Person("User3", box);
        new Person("User4", box);
        new Person("User5", box);
    }
}

class Person extends Thread{
    String name;
    private Semaphore semaphore;

    public Person(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " is waiting for.........");
            semaphore.acquire(); //считает в семафоре кол-во потоков и блокирует наш метод
            System.out.println(name + " is using");
            Thread.sleep(2500);
            System.out.println(name + " is finished");
            System.out.println("--------");
            //semaphore.wait(1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }
}