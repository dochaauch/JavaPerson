package profJava.cons230217.LobbyMultithreading;

import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;

public class Session implements Runnable{
    private Integer sessionId;
    private CountDownLatch latch;
    private final List<User> users = new Vector<>();


    public Session(int sessionId, CountDownLatch latch) {
        this.sessionId = sessionId;
        this.latch = latch;
    }


    //this function is pouse to be havy
    private void registerUser(User user) {
        try {
            //some havy operation
            Thread.sleep((int) (Math.random() *4000) + 500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void addUser(User user) {
        if(user != null) {
            registerUser(user);
            System.out.println(
                    String.format("user: %d was added to the session %d",
                            user.getUserId(), sessionId)
            );
            latch.countDown();
        }
    }

    @Override
    public void run() {
        System.out.println(
                String.format("Session %d has started.", sessionId));
        for (User user: users){
            user.sendMessage("started", sessionId);
        }
        //emulate some dutes of session before it finished
        try {
            Thread.sleep((int) (Math.random() * 500) + 100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
