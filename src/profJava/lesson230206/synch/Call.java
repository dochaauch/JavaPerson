package profJava.lesson230206.synch;

import lombok.ToString;

public class Call {
    static final Object LOCK = new Object();

    public static void main(String[] args) {
        Thread mob = new Thread(new Mobile());
        Thread skype = new Thread(new Skype());
        Thread zoom = new Thread(new Zoom());

        mob.setName("[MOBILE THREAD]");
        skype.setName("[SKYPE THREAD]");
        zoom.setName("[ZOOM THREAD]");

        mob.start();
        skype.start();
        zoom.start();
    }
    void mobileCall() throws InterruptedException {
        synchronized (LOCK) {
            System.out.println();
            System.out.println(LOCK);
            System.out.println("Mobile call starts" + " | " +Thread.currentThread().getName());
            Thread.sleep(1100);
            System.out.println("Mobile call finished" + " | " +Thread.currentThread().getName());
        }
    }
    void skypeCall() throws InterruptedException {
        synchronized (this) {
            System.out.println(this);
            System.out.println("Skype call starts" + " | " +Thread.currentThread().getName());
            Thread.sleep(1500);
            System.out.println("Skype call finished" + " | " +Thread.currentThread().getName());
        }
    }
    synchronized void zoomCall() throws InterruptedException {
        synchronized (this){
            System.out.println(this);
            System.out.println("Zoom call starts" + " | " +Thread.currentThread().getName());
            Thread.sleep(2200);
            System.out.println("Zoom call finished" + " | " +Thread.currentThread().getName());
        }

    }
}

@ToString
class Mobile implements Runnable{

    @Override
    public void run() {
        try {
            new Call01().mobileCall();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

@ToString
class Skype implements Runnable{

    @Override
    public void run() {
        try {
            new Call01().skypeCall();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

@ToString
class Zoom implements Runnable{

    @Override
    public void run() {
        try {
            new Call01().zoomCall();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}