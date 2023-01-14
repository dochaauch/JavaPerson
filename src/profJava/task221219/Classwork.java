package profJava.task221219;

//public class Classwork {
//
//    public static void main(String[] args) {
//        //simpleIteratorEx();
//        //spliterratorWithRemaining();
//
//        //forEachEx();
//
//        //simpleLambdaCapture();
//
//        //splitting();
//
//        Iterable<Cat> cats = List.of(
//                new Cat("Vaska"),
//                new Cat("Barsik"),
//                new Cat("Murzik"),
//                new Cat("Murka"),
//                new Cat("Tom"),
//                new Cat("Spike")
//        );
//        //StreamSupport.stream(cats.spliterator(), false);
//
//
//        Map<Dog> dogs = cats.stream()
//                .sorted(Comparator.comparing(Animal::getName))
//                .filter(c -> !c.getName().endsWith("ik"))
//                .peek(System.out::println)
//                .map(c -> new Dog(c.getName()))
//                .collect(Collectors.toMap(Animal::getName, Function.identity()))
//
//                //.toList()
//                //.collect(Collectors.toList())
//        ;
//
//
//
//    }
//
//    private static void splitting() {
//        List<Integer> ints = List.of(1, 2, 3, 4, 5, 6, 6, 7, 8, 9);
//        Spliterator<Integer> spliterator1 = ints.spliterator();
//        Spliterator<Integer> spliterator2 = spliterator1.trySplit();
//
//        System.out.println("SPLIT1:");
//        spliterator1.forEachRemaining(System.out::println);
//        System.out.println("SPLIT2:");
//        spliterator2.forEachRemaining(System.out::println);
//    }
//
//    private static void simpleLambdaCapture() {
//        List<String> list = new ArrayList<>(List.of("One", "Two", "Three"));
//        for (int i = 0; i < list.size(); i++) {
//            int j = i; // j тут считается final для данного цикла и сработает.
//            new Thread(() -> System.out.println("Running word " +list.get(j) +
//                    "  Thread: " + Thread.currentThread().getName())).start();
//        }
//    }
//
//    private static void forEachEx() {
//        List<String> list = new ArrayList<>(List.of("One", "Two", "Three"));
//        for (String s : list) {
//            s = "Str: " + s + " something";
//            System.out.println(s);
//        }
//        System.out.println("AFTER LOOP");
//        System.out.println(list);
//    }
//
//    private static void spliterratorWithRemaining() {
//        List<Integer> ints = List.of(1, 2, 3, 4, 5, 6, 6, 7, 8, 9);
//        Spliterator<Integer> spliterator = ints.spliterator();
//        boolean result = false;
//        int counter = 0;
//        do {
//            counter++;
//            result = spliterator.tryAdvance(new Consumer<Integer>() {
//                @Override
//                public void accept(Integer integer) {
//                    System.out.println(integer);
//                }
//            });
//        } while (result && counter <6);
//        System.out.println("AFTER LOOP");
//        int count = counter;
//        spliterator.forEachRemaining(e -> System.out.println(e + count + " el"));
//    }
//
//    private static void simpleIteratorEx() {
//        List<Integer> ints = List.of(1, 2, 3, 4, 5, 6, 6, 7, 8, 9);
//        Spliterator<Integer> spliterator = ints.spliterator();
//        boolean result = false;
//        do {
//            result = spliterator.tryAdvance(new Consumer<Integer>() {
//                @Override
//                public void accept(Integer integer) {
//                    System.out.println(integer);
//                }
//            });
//        } while (result);
//    }
//}
