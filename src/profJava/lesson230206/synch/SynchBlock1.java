package profJava.lesson230206.synch;

public class SynchBlock1 {
    public static void main(String[] args) {
        M1 runnable = new M1();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Counter {
    volatile static int count = 0;
}

class M1 implements Runnable{
    private void doWork2() {
        for (char i = 'A'; i < 'Z'; i++) {
            System.out.println(i + " ");
        }
    }
    public synchronized void doWork() {
        doWork2();
        synchronized (this) {
            Counter.count++;
            System.out.print(Counter.count + " ");
        }
    }



    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            doWork();
        }
    }

}
