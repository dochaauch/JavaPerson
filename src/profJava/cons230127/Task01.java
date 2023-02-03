package profJava.cons230127;

import java.util.List;

/*Напишите программу, которая принимает на вход текстовый файл содержащий числа. Для каждой строки:
1. отсортировать числа в порядке убывания.
2. Записать отсортированные числа в файл: исходное_имя_файла_sorted.txt
3. Подсчитать сумму четных чисел для каждой строки.
4. Подсчитать среднее значение для нечетных чисел каждой строки.
5. Найти минимальное и максимальное значение для каждой строки.
Записать результаты в файл в формате:
Line: # ; SEven: ; AOdd: ; Max: ; Min:
6. добавить юнит тесты к программе.*/
public class Task01 {

    public static void main(String[] args) throws InvalidLineException {
      List<String> listOfStrings = Reader.readFromFile("./src/profJava/cons230127/seq2.txt");
      Writer writer =  new Writer("./src/profJava/cons230127/seq1_sorted.txt");
      for (String s : listOfStrings) {
          DataProcessor dp = new DataProcessor();
          try {
              List<Integer> listOfEachRow = Parser.parse(s);
              writer.write(dp.sorted(listOfEachRow));
          } catch (InvalidLineException e) {
              System.err.println("Skipping line: " + s + " due to: " + e.getMessage());
              continue;
          }
          System.out.println(Parser.parse(s));
      }
    writer.close();
    }
}
