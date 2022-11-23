package profJava.lesson221123;

import lombok.AllArgsConstructor;
import lombok.ToString;

/*
1. Отсортировать массив стрингов как на рисунке
Input: { {"abc", 3}, {"a", 4}, {"bc", 5}, {"a", 2} }

Output: { {"a", 2}, {"a", 4}, {"abc", 3}, {"bc", 5} }

2. В наших классах которые мы пишем, все сущности заимплементить от Comparable*/
@AllArgsConstructor
@ToString
public class Task01 {
    String s;
    Integer i;
}
