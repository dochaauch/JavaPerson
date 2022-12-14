package profJava.homework221214Interf;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor

public class MyQueueImpl implements MyQueue{
    private List arr;

    //Collection
    @Override
    public void add(Object el) {
        arr.add(el);
    }

    @Override
    public void remove(Object el) {
        arr.remove(el);
    }

    @Override
    public void get(int index) {
        arr.get(index);
    }
}
