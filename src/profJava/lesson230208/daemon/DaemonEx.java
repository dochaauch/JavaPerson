package profJava.lesson230208.daemon;

import java.io.FileWriter;
import java.io.IOException;

public class DaemonEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("MAIN START");

        UT ut = new UT();
        ut.setName("USER-THREAD");

        DT dt = new DT();
        dt.setName("DAEMON-THREAD");
        dt.setDaemon(true);

        ut.start();
        dt.start();

        ut.join();
        //dt.join();

        System.out.println("MAIN END");
    }

}

class UT extends Thread {
    @Override
    public void run() {
        System.out.println("User Thread Class [ " +Thread.currentThread().getName() + " ]");
        System.out.println("IS DAEMON: [" + isDaemon() + "]");
        for (char i = 'A'; i < '^'; i++) {
            try {
                sleep(50);
                System.out.println("CHAR [" + i + "]");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class DT extends Thread {
    public void run() {
        System.out.println("Daemon thread class [ " + Thread.currentThread().getName() + " ]");
        System.out.println("IS DAEMON: [" + isDaemon() + "]");
        try (FileWriter writer = new FileWriter("./src/profJava/lesson230208/daemon/dt.txt");){
            for (int i = 0; i < 50; i++) {
                sleep(100);
                System.out.println("INTEGER [" + i + "]");
                writer.write("INTEGER [" + i + "]\n");
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
