package profJava.lesson221128.typeErasure;

import java.util.ArrayList;

public class ParametrizedMethodEx1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //ArrayList list= new ArrayList(); компилятор видим raw type
        int i = list.get(0);
        //int i = (Integer) list.get(0);
    }


}
