package profJava.cons230127;

import java.util.List;

public class DataProcessor {
    public String sorted(List<Integer> listOfInteger){
        return listOfInteger
                .stream()
                .sorted((e1, e2) -> e2-e1)
                .toString();
    }

    public int sumEven(List<Integer> listOfInteger) {
        return listOfInteger
                .stream()
                .filter(el -> el % 2==0)
                .mapToInt(Integer::intValue)
                .sum();
    }

    public double avgOdd(List<Integer> listOfInteger) {
        return listOfInteger
                .stream()
                .filter(el -> el % 2 != 0)
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
    }

    public int min(List<Integer> listOfInteger) {
        return listOfInteger
                .stream()
                .mapToInt(Integer::intValue)
                .min()
                .orElse(0);
    }

    public int max(List<Integer> list){
        return list.stream()
                .max((e1, e2) -> e2 - e1)
                .orElse(0);
    }
}
