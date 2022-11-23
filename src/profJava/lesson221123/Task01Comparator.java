package profJava.lesson221123;

import java.util.Comparator;

public class Task01Comparator implements Comparator<Task01> {
    @Override
    public int compare(Task01 o1, Task01 o2) {
        int res = o1.s.compareTo(o2.s);
        if(res == 0) {
            return o1.i - o2.i;
        }
        return res;
    }
}
