package profJava.cons221223;

import java.util.*;
import java.util.stream.IntStream;


/*Из заданного массива слов заполнить ArrayList( 1000 ) случайными словами.
Подсчитать сколько каждое слово встречается раз в ArrayList
Вывести слово, которое повторяется чаще всего.
Если таких слов несколько - вывести наименьшее из них.

Массив слов получить из строки = “Не говори мне о толпе безумной
Она иной раз вдохновение спугнёт
Избавь меня от этой давки шумной
Влекущей мощно в свой водоворот
Нет тишины ищу я многодумный
Лишь там поэту радость расцветёт
Там только там божественною властью
Любовь и дружба нас приводит к счастью”*/
public class Task1 {
    public static void main(String[] args) {
        String str = """
                        Не говори мне о толпе безумной 
                        Она иной раз вдохновение спугнёт
                        Избавь меня от этой давки шумной
                        Влекущей мощно в свой водоворот
                        Нет тишины ищу я многодумный
                        Лишь там поэту радость расцветёт
                        Там только там божественною властью
                        Любовь и дружба нас приводит к счастью""";
        String[] arrayStr = str.toLowerCase().split("\\P{LD}+");
        System.out.println(Arrays.toString(arrayStr));
        System.out.println(arrayStr.length);

        List<String> listWord = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            int index = (int) (Math.random() * arrayStr.length);
            //listWord.add(arrayStr[new Random().nextInt(43)]);
            listWord.add(arrayStr[index]);
        }

        IntStream.range(0, 1000).forEach(i ->
            listWord.add(arrayStr[(int) (Math.random() * arrayStr.length)])
        );

        listWord.stream()
                .forEach(e -> System.out.print(e + " "));

        Map<String, Integer> map = new HashMap<>();

//        for (String word : listWord) {
//            if(!map.containsKey(word)){
//                map.put(word, 1);
//            } else {
//                Integer value = map.get(word);
//                value++;
//                map.put(word, value);
//            }
//        }

//        for (String word : listWord) {
//            map.merge(word, 1, new BiFunction<Integer, Integer, Integer>() {
//                @Override
//                public Integer apply(Integer i1, Integer i2) {
//                    return i2+i1;
//                }
//            });
//        }

//        for (String word: listWord) {
//            map.merge(word, 1, (i1, i2) -> i1 + i2;
//        }

//        for (String word: listWord) {
//            map.merge(word, 1, Integer::sum);
//        }

        listWord.forEach(word -> {
            map.merge(word,1, Integer::sum);
        });

        int sum = 0;
        for (Map.Entry<String, Integer> m: map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
            sum += m.getValue();
        }
        System.out.println(map.size());


        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        List<Map.Entry<String, Integer>> listSet = new LinkedList<>(entrySet);
//        listSet.sort(new Comparator<Map.Entry<String, Integer>>() {
//            @Override
//            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
//                int res = o2.getValue() - o1.getValue(); //max
//                if (res == 0) {
//                    res = o1.getKey().compareTo(o2.getKey()); //min
//                }
//                return res;
//            }
//        });

        listSet.sort((o1, o2) -> {
            int res = o2.getValue() - o1.getValue(); //max
            if (res == 0) {
                res = o1.getKey().compareTo(o2.getKey()); //min
            }
            return res;
        });

        System.out.println("***");
        for (var l: listSet) {
            System.out.println(l.getKey()+ " " + l.getValue());
        }

    }
}
