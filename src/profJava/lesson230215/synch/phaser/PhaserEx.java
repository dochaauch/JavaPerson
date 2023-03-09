package profJava.lesson230215.synch.phaser;

import java.util.concurrent.Phaser;

public class PhaserEx {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(2);
        new Washer(phaser, "Konstantin");
        new Washer(phaser, "Ivan");
        new Washer(phaser, "Alexey");
    }

    static class Washer extends Thread{
        Phaser phaser;
        String name;

        public Washer(Phaser phaser, String name) {
            this.phaser = phaser;
            this.name = name;
            Thread.currentThread().setName(name);
            this.start();
        }

        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                try {
                    Thread.sleep(2500);
                    System.out.println(getName() + " is washing a car.......");
                    phaser.arriveAndAwaitAdvance();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
