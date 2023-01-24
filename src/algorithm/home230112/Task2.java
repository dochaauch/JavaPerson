package algorithm.home230112;

import java.util.Arrays;

/*Самый дешёвый путь
В каждой клетке прямоугольной таблицы N*M записано некоторое число.
Изначально игрок находится в левой верхней клетке.
За один ход ему разрешается перемещаться в соседнюю клетку либо вправо, либо вниз
(влево и вверх перемещаться запрещено).
При проходе через клетку игрок платит определенную сумму, какое число записано в этой клетке.
Требуется найти минимальную стоимость пути, отдав которую игрок может попасть в правый нижний угол.*/
public class Task2 {
    public static void main(String[] args) {

    }


    static int[][] grid;
    static int[][] memo;

    public int findMinimumCost(int n, int m) {
        grid = new int[n][m];
        memo = new int[n][m];
        for(int i = 0; i < n; i++) {
            Arrays.fill(memo[i], Integer.MAX_VALUE);
        }
        // fill the grid with costs
        return findMinimumCostHelper(0, 0);
    }

    private int findMinimumCostHelper(int i, int j) {
        if (i == grid.length - 1 && j == grid[0].length - 1) {
            return grid[i][j];
        }
        if (memo[i][j] != Integer.MAX_VALUE) {
            return memo[i][j];
        }
        int minCost = grid[i][j];
        if (i < grid.length - 1) {
            minCost = Math.min(minCost, findMinimumCostHelper(i + 1, j) + grid[i][j]);
        }
        if (j < grid[0].length - 1) {
            minCost = Math.min(minCost, findMinimumCostHelper(i, j + 1) + grid[i][j]);
        }
        memo[i][j] = minCost;
        return minCost;
    }
}
