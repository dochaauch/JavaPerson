package profJava.lesson230208;

public class Interruption {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main start");

        InterruptedThread T1 = new InterruptedThread();
        T1.start();
        System.out.println(T1.getState());
        Thread.sleep(1500);//спит. если он не будет спать, то сразу будет isInterrupted()
        System.out.println(T1.getState());
        T1.interrupt();
        System.out.println(T1.getState());

        T1.join(); //main должен подождать окончания этого потока
        System.out.println("Main end");

    }
}

class InterruptedThread extends Thread {
    double sqrtSum = 0;

    @Override
    public void run() {
        for (int i = 0; i < 1_000_000; i++) {
            //sqrtSum += Math.sqrt(i);
            if(isInterrupted()){
                System.out.println("Has been interrupted");
                return;
            }
            sqrtSum += Math.sqrt(i);
            try {
                sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Current thread T1 was interrupted while sleeping");
                return;
            } finally {
                System.out.println("SQRT: " + sqrtSum);
            }
        }
    }
}
