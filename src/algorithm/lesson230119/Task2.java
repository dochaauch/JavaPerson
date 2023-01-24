package algorithm.lesson230119;
/*Самый дешёвый путь
В каждой клетке прямоугольной таблицы N*M записано некоторое число.
Изначально игрок находится в левой верхней клетке.
За один ход ему разрешается перемещаться в соседнюю клетку либо вправо, либо вниз
(влево и вверх перемещаться запрещено).
При проходе через клетку игрок платит определенную сумму, какое число записано в этой клетке.
Требуется найти минимальную стоимость пути, отдав которую игрок может попасть в правый нижний угол.
Вариант преподавателя*/
public class Task2 {
    public static void main(String[] args) {
        int[][] costs = new int[][] {
                {0,2,4,1,6,7},
                {0,2,4,1,6,7},
                {0,2,4,1,6,0},
        };
        System.out.println(minimalCost(costs, 0, 0));
    }

    private static int minimalCost(int[][] costs, int i, int j) {
        if (i >=costs.length || j >= costs[0].length) return 1_000_000;
        if (i == costs.length-1 && j == costs[0].length -1) return costs[i][j];

        int minCost = costs[i][j] + Math.min(minimalCost(costs, i+1, j),
                minimalCost(costs, i, j+1));
        return minCost;
    }

}
