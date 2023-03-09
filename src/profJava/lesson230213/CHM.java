package profJava.lesson230213;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class CHM {
    public static void main(String[] args) {
        //ArrayList<Integer> integers = new ArrayList<>();
        //List<Integer> integers = Collections.synchronizedList(new ArrayList<>());
        ConcurrentHashMap<Integer, String > map = new ConcurrentHashMap<>();
        CopyOnWriteArrayList<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
    }
}

