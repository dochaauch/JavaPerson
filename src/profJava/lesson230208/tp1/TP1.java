package profJava.lesson230208.tp1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TP1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("MAIN START");
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 15; i++) {
            executorService.execute(new Run());
        }
        executorService.shutdown();
        executorService.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("MAIN END");
    }
}

class Run implements Runnable {

    @Override
    public void run() {
        System.out.println("THREAD NAME IS: " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
