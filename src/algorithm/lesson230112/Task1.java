package algorithm.lesson230112;
/*1. Вычислить n-й член последовательности, заданной формулами:
a(2n) = a(n) + a(n-1),
a(2n+1) = a(n) — a(n-1),
a(0) = a(1) = 1.

a(0) = 1
a(1) = 1
a(2) = 2 => (2 = 2*1) => a(1)+a(0)
a(3) = 0 => (3 = 2*1+1) =>  a(1)-a(0)
a(4) = 3 => (4 = 2*2) => a(2) + a(1)
a(5) = 1 => (5 = 2*2+1) =>a(2) - a(1)
*/

public class Task1 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < 8; i++) {
            System.out.println("a(" + i + ") -> " + findNRecurssion(i));
        }
        //System.out.println(findN(n));
        System.out.println(findNRecurssionMemo(7));
        System.out.println(findNTabOpt(7));

        for (int i = 0; i < 8; i++) {
            System.out.println("a(" + i + ") -> " + findNTabOpt(i));
        }


    }

    private static long findNRecurssion(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        if(n % 2 == 0) return findNRecurssion(n/2) + findNRecurssion(n/2 -1);
        return findNRecurssion(n/2) - findNRecurssion(n/2 -1);
    }

    static long[] values = new long[100];
    private static long findNRecurssionMemo(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        long nextValue;

        if(values[n] != 0) return values[n];
        if(n % 2 == 0) {
            nextValue = findNRecurssionMemo(n/2) + findNRecurssionMemo(n/2-1);
        } else {
            nextValue = findNRecurssionMemo(n/2) - findNRecurssionMemo(n/2-1);
        }
        values[n] = nextValue;
        return nextValue;
    }

    private static long findNTabOpt(int n) {
        long cache1 = 1;
        long cache2 = 1;
        long cache3 = 2;
        if(n == 1) return 1;
        if(n == 2) return 1;
        for (int i = 2; i < n; i++) {
            if(i%2==0){
                cache3 = cache1 + cache2;
            } else {
                cache3 = cache2 - cache1;
            }
            cache1 = cache2;
            cache2 = cache3;
        }
        return cache3;
    }
}
