package profJava.homework221214Interf;

import lombok.AllArgsConstructor;

import java.util.Set;

@AllArgsConstructor

public class MyStackImpl implements MyStack {
    private Set set;
    @Override
    public void add(Object el) {
        set.add(el);
    }

    @Override
    public void delete(Object el) {
        set.remove(el);
    }

    @Override
    public void isEmpty() {
        set.isEmpty();
    }
}
