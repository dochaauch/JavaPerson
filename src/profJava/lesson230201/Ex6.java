package profJava.lesson230201;

public class Ex6 implements Runnable{

    @Override
    public void run() {
        Thread.currentThread().setName("EX6-THREAD");
        System.out.println("Thread name: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Ex6());
        thread.run();

        System.out.println("Main: " + Thread.currentThread().getName());
    }
}
