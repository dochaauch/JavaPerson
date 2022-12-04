package profJava.homework221201;

import java.util.HashMap;
import java.util.Map;

public enum League {
    START(0),
    JUNIOR(1),
    MIDDLE(2),
    SENIOR(3),
    PRIME(4),
    SUPERLEAGUE(5);

    private int number;

    League(int number) {
        this.number = number;
    }

    private static final Map<Integer, League> BY_NUMBER = new HashMap<>();

    static {
        for (League l : values()) {
            BY_NUMBER.put(l.number, l);
        }
    }

    public static League getLeagueByNumber(Integer i) {
        return BY_NUMBER.get(i);
    }

    public int getNumber() {
        return number;
    }
}
