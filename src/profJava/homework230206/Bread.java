package profJava.homework230206;

public class Bread {

    private volatile static int counter = 100;
    private static final int BUFFER_SIZE = 5;
    private volatile static int breadInStock = 0;
    private volatile static int breadInShop = 0;
    private static Object lock = new Object();

    static class Producer implements Runnable {
        @Override
        public void run() {
            while (counter > 0) {
                synchronized (lock) {
                    while (breadInStock == BUFFER_SIZE) {
                        waitUntilConditionMet();
                    }
                    breadInStock++;
                    counter--;
                    System.out.printf("Producer produced bread, bread in stock: %d, bread in shop %d.\n",
                            breadInStock, breadInShop);
                    lock.notifyAll();
                }
            }

        }
    }

    static class Seller implements Runnable {
        @Override
        public void run() {
            while (counter > 0) {
                synchronized (lock) {
                    while (breadInStock == 0 || breadInShop == BUFFER_SIZE) {
                        waitUntilConditionMet();
                    }
                    breadInStock--;
                    breadInShop++;
                    counter--;
                    System.out.printf("Seller sold bread, bread in stock: %d, bread in shop %d.\n",
                            breadInStock, breadInShop);
                    lock.notifyAll();
                }
            }
        }
    }

    static class Consumer implements Runnable {
        @Override
        public void run() {
            while (counter > 0) {
                synchronized (lock) {
                    while (breadInShop == 0) {
                        waitUntilConditionMet();
                    }
                    breadInShop--;
                    counter--;
                    System.out.printf("Consumer consumed bread, bread in stock: %d, bread in shop %d.\n",
                            breadInStock, breadInShop);
                    lock.notifyAll();
                }
            }
        }
    }

    private static void waitUntilConditionMet() {
        try {
            lock.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("Start the process");
        Thread producerThread = new Thread(new Producer());
        Thread sellerThread = new Thread(new Seller());
        Thread consumerThread = new Thread(new Consumer());
        producerThread.start();
        sellerThread.start();
        consumerThread.start();
    }
}

