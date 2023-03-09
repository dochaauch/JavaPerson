package profJava.lesson230213;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicEx {
    static AtomicInteger counter = new AtomicInteger(0);

    public static void increment() {
        //counter++;

        System.out.println(counter.incrementAndGet());
    }

    public static void main(String[] args) throws InterruptedException {


        Thread t1 =  new Thread(new M11());
        Thread t2 =  new Thread(new M11());

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(counter);
    }
}

class M11 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 22; i++) {
            AtomicEx.increment();
        }
    }
}
