package profJava.cons230217.LobbyMultithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class User implements Comparable<User>{
    private static AtomicInteger userIds =
            new AtomicInteger(0); //статик - чтобы его могли использовать все объекты класса
    private Integer scores;
    private Integer userId;

    public User(int scores){
        this.scores = scores;
        this.userId = userIds.incrementAndGet();//увеличиваем ид на 1
    }

    public Integer getUserId() {
        return userId;
    }
    public Integer getScores(){
        return scores;
    }

    @Override
    public int compareTo(User u) {
        return scores - u.getScores();
    }

    public void sendMessage(String message, Integer sessionId) {
        if (message.equals("started")) {
            System.out.println(
                    String.format("session %d is started for the user %d",
                            sessionId, userId)
            );
        }
    }
}
