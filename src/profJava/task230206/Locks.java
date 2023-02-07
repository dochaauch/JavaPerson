package profJava.task230206;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Locks {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();

        new Thread(() -> {
            System.out.println("Before lock 1");
            try {
                lock.lock();
                System.out.println("Got lock 1");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println("Release lock 1");
                lock.unlock();
            }
        }).start();

//        new Thread(() -> {
//            System.out.println("Before lock 2");
//            try {
//                lock.lock();
//                System.out.println("Got lock 2");
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            } finally {
//                System.out.println("Release lock 2");
//                lock.unlock();
//            }
//        }).start();

        new Thread(() -> {
            System.out.println("Before lock 3");
            try {
                lock.lock();
                System.out.println("Got lock 3");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println("Release lock 3");
                lock.unlock();
            }
        });
    }
}
