package algorithm.lesson221117;

import java.util.Scanner;

public class IndividualWork {
    /*1. Написать псевдокод для алгоритма: сложить три числа и вывести сумму
2. Реальзовать алгоритм в коде

Шаг 1: Выполнение предварительных условий
Шаг 2: Разработка алгоритма

Алгоритм сложения 3 чисел и вывода их суммы:

Получить от пользователя 3 целочисленные переменные num1, num2 и num3. Сканер.
Возьмите три добавляемых числа в качестве входных данных для переменных num1, num2 и num3 соответственно.
Объявите целочисленную переменную sum для хранения результирующей суммы трех чисел.
Добавьте 3 числа и сохраните результат в переменной sum.
Вывести значение переменной sum

Шаг 3: Проверка алгоритма путем его реализации.

START
Input num1, num2, num3
create sum
sum = num1+num2+num3
output sum
END
*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        scan.close();

        int sum = addUpNums(num1, num2, num3);
        printResult(sum);
    }

    private static void printResult(int sum) {
        System.out.println(sum);
    }

    private static int addUpNums(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}
