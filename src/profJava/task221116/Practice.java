package profJava.task221116;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.UnaryOperator;

public class Practice {

    public static void main(String[] args) {
        //interfacesDemo();
        List<Integer> integer = new ArrayList<>(List.of(1, 2,3,4,5,6,7,8));
        integer.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return  o2-o1;
            }
        });

        integer.sort((o1, o2) -> o2-o1);
        integer.sort(Integer::compare);
        System.out.println(integer);

        integer.replaceAll(new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * 2;
            }
        });
        integer.replaceAll(i-> i*2);

        integer.forEach(System.out::println);

        Oper oper = Oper.MUL;
        System.out.println(oper.operate(10, 14));
        oper = Oper.SUB;
        System.out.println(oper.operate(10, 14));

    }

    private static void interfacesDemo() {
        Moving[] units = {
                new Horse(),
                new Human(),
                new Plane(),
                new Submarine(),
                new Moving() {
                    @Override
                    public void move() {
                        System.out.println("Anon");
                    }
                },
                () -> System.out.println("sdfb")
        };
        for (Moving unit : units) {
            unit.move();
            //((Human) unit).doSomething();
            if (unit instanceof Human) {
                ((Human) unit).doSomething();
            }
            if (unit instanceof Attacking) {
                ((Attacking) unit).attack();
                ((Attacking) unit).doDefault();
            }
            System.out.println(Attacking.SOME_FIELD);
            System.out.println();
        }
    }
}
