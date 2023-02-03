package profJava.lesson230201;

public class Ex11 {
    static int counter = 0;
    public static synchronized void increment(){
        counter++;
        System.out.println(counter  + " thread name " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new M());
        Thread thread2 = new Thread(new M());

        thread1.start();
        thread2.start();
        System.out.println("!!  "+ counter + " thread name " + Thread.currentThread().getName());
    }
}
class M implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            Ex11.increment();
        }
    }
}
