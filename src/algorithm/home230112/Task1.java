package algorithm.home230112;

import java.util.Arrays;

/*2. На вершине лесенки, содержащей N ступенек, находится мячик, который начинает прыгать по ним вниз,
 к основанию.
Мячик может прыгнуть на следующую ступеньку, на ступеньку через одну или через 2.
(То есть, если мячик лежит на 8-ой ступеньке, то он может переместиться на 5-ую, 6-ую или 7-ую.)
Определить число всевозможных «маршрутов» мячика с вершины на землю.*/
public class Task1 {
    public static void main(String[] args) {
        System.out.println(findCountOfRouts(5));
        System.out.println(findCountOfRoutsMemo(5));
        System.out.println(findCountOfRoutsTab(5));
        System.out.println(findCountOfRoutsTabOpt(5));
    }

    public static int findCountOfRoutsTabOpt(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;
        if(n == 3) return 4;
        int a = 1, b = 2, c = 4; // a, b and c represent the last 3 values
        for(int i = 4; i <= n; i++) {
            int res = a + b + c;
            a = b;
            b = c;
            c = res;
        }
        return c;
    }

    public static int findCountOfRoutsTab(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;
        if(n == 3) return 4;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for(int i = 4; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }
        return dp[n];
    }


    static int[] memo = new int[100];

    private static int findCountOfRoutsMemo(int n) {
        //memo = new int[n + 1];
        Arrays.fill(memo, -1);

        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 4;
        if (memo[n] != -1) return memo[n];
        memo[n] = findCountOfRoutsMemo(n-1) + findCountOfRouts(n-2) + findCountOfRoutsMemo(n-3);
        return memo[n];
    }

    private static int findCountOfRouts(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 4;
        return findCountOfRouts(n-1) + findCountOfRouts(n-2) + findCountOfRouts(n-3);
    }


}
