package algorithm.lesson230202;
/*    Given a number dist count total number of ways to cover the distance with 1, 2 and 3 steps.
//    Example: n = 3
//    Result: 4
//    Notes:
//      1  + 1  + 1
//      1  + 2
//      2  + 1
//      3
//
//    Example: n = 4
//    Result: 7
//    Notes:
//      1  + 1  + 1  + 1
//      1  + 2  + 1
//      2  + 1  + 1
//      1  + 1  + 2
//      2  + 2
//      3  + 1
//      1  + 3*/
public class Test3 {
    public static int coverDistance(int n) {
        if (n < 0) {
            throw new UnsupportedOperationException("Negative distance is not supported");
        } else if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            return coverDistance(n - 1) + coverDistance(n - 2) + coverDistance(n - 3);
        }
    }

    public static int coverDistanceTabAndOpt(int n) {
        if (n < 0) {
            throw new UnsupportedOperationException("Negative distance is not supported");
        }

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(coverDistance(3)); //4
        System.out.println(coverDistance(4)); //7
        System.out.println(coverDistanceTabAndOpt(3)); //7
        System.out.println(coverDistanceTabAndOpt(4)); //7
    }
}
