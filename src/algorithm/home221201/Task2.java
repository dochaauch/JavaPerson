package algorithm.home221201;
/*Задача заключается в следующем. Имеется три стержня — левый, средний и правый. На левом стержне находятся n дисков,
диаметры которых различны.
Диски упорядочены по размеру диаметра, сверху лежит наименьший, снизу — наибольший.
Требуется перенести диски с левого стержня на правый, используя средний стержень как вспомогательный.
Головоломка имеет следующие два правила:
      1. Вы не можете поместить больший диск на меньший диск.
      2. За один раз можно перемещать только один диск.
      Задача  - придумать и описать алгоритм. Можно текстом, можно псевдокодом.
*/
public class Task2 {
    public static void main(String[] args) {
        hanoi(4, 1, 2);
    }
    public static void hanoi(int n, int i, int k) {
        if(n==1) {
            System.out.println(String.format("Move disk 1 from pin %d to %d", i, k));
        } else {
            int tmp = 6 - i -k;
            hanoi(n-1, i, tmp);
            System.out.println(String.format("Move disk %d from pin %d to %d", n, i, k));
            hanoi(n-1, tmp, k);
        }
    }
}