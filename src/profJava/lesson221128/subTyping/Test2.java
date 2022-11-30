package profJava.lesson221128.subTyping;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        X x = new Y(); // так можно
        //List<Number> list = new ArrayList<Integer>(); так нельзя!

    }
}

class X {

}

class Y extends X{

}
