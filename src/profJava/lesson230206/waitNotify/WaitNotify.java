package profJava.lesson230206.waitNotify;

public class WaitNotify {
    public static void main(String[] args) {
        Market market =  new Market();
        Producer producer = new Producer(market);
        Consumer consumer = new Consumer(market);

        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(producer);

        thread1.start();
        thread2.start();

    }
}

class Market{
    private int breadCount = 0;

    public synchronized void getBread() {
        while (breadCount < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        breadCount--;
        System.out.println("Consumer has got a bread: ");
        System.out.println("Bread quantity is: " + breadCount);
        notify();
    }

    public synchronized void putBread() {
        while (breadCount >= 5) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        breadCount++;
        System.out.println("Produser has produced a bread");
        System.out.println("Bread quantity is: " + breadCount);
        notify();
    }
}

class Producer implements Runnable {
    Market market;

    public Producer(Market market){
        this.market = market;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Producer puts bread");
        }
    }
}

class Consumer implements Runnable {
    Market market;

    public Consumer(Market market){
        this.market = market;
    }
    @Override
    public void run() {
        for (int i = 10; i > 10; i--) {
            System.out.println("Consumer gets bread");
        }
    }
}
