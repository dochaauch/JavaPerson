package profJava.cons230217.LobbyMultithreading;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.PriorityBlockingQueue;

public class Lobby {
    private Integer sessionSize;
    private Integer sessionId;
    private final BlockingQueue<User> users =
            new PriorityBlockingQueue<>();

    public Lobby(Integer sessionSize){
        this.sessionSize = sessionSize;
        this.sessionId = 0;
    }

    public void addUser(User user) {
        users.offer(user);
        if (users.size() >= sessionSize) {
            new Thread(() -> createSession()).start();
        }
    }

    private void createSession() {
        CountDownLatch latch = new CountDownLatch(sessionSize);
        Session session = new Session(++sessionId, latch);
        for (int i = 0; i < sessionSize; i++) {
            //cause adding user in our case it havy operation
            //we will do it in separate Thread
            new Thread(() -> session.addUser(users.poll() ) ).start();
        }
        try {
            latch.await();
            new Thread(session).start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
