package profJava.lesson230206.synch;

import lombok.ToString;

@ToString
public class Call01 {
    static final Object LOCK = new Object();

    public static void main(String[] args) {
        DOTHIS dothis = new DOTHIS();

        Thread mob = new Thread(dothis);
        Thread zoom = new Thread(dothis);
        Thread skype = new Thread(dothis);

        mob.setName("[MOBILE THREAD]");
        zoom.setName("[ZOOM THREAD]");
        skype.setName("[SKYPE THREAD]");

        mob.start();
        zoom.start();
        skype.start();
    }

    void mobileCall() throws InterruptedException {
        //      synchronized (LOCK) {
        System.out.println("Mobile call starts" + " | " + Thread.currentThread().getName());
        Thread.sleep(1500);
        System.out.println("Mobile call finished" + " | " + Thread.currentThread().getName());
        //       }
    }

    void skypeCall() throws InterruptedException {
        //       synchronized (LOCK) {
        System.out.println("Skype call starts" + " | " + Thread.currentThread().getName());
        Thread.sleep(1500);
        System.out.println("Skype call finished" + " | " + Thread.currentThread().getName());
//        }
    }

    void zoomCall() throws InterruptedException {
//        synchronized (LOCK) {
        System.out.println("Zoom call starts" + " | " + Thread.currentThread().getName());
        Thread.sleep(1500);
        System.out.println("Zoom call finished" + " | " + Thread.currentThread().getName());
        //       }
    }
}

class DOTHIS implements Runnable {
    Call01 call01 = new Call01();

    @Override
    public void run() {
        try {
            //1 2 3
            synchronized (this) {
                call01.mobileCall();
                call01.skypeCall();
                call01.zoomCall();
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}