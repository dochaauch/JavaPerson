package profJava.lesson221219.streams;

import java.util.function.Predicate;

public class Ex1 implements Predicate<Integer>{
    @Override
    public boolean test(Integer integer) {
        return false;
    }


}

@FunctionalInterface
interface Inter {
    void get();
    boolean equals(Object o);

}
