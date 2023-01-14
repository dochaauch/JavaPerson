package algorithm.lesson230112.dynamicProgramming;

public class Fibonachi {
    public static void main(String[] args) {
        int n = 8;
//        long start = System.currentTimeMillis();
//        System.out.println(fibonachiRecusive(n));
//        System.out.println("time: " +(System.currentTimeMillis() - start));

        long start = System.currentTimeMillis();
        System.out.println(fibonachiMemo(n));
        System.out.println("time: " +(System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        System.out.println(fibonachiTab(n));
        System.out.println("time: " +(System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        System.out.println(fibonachiTabOpt(n));
        System.out.println("time: " +(System.currentTimeMillis() - start));
    }

    static int l = 250;
    static long[] valuesTab = new long[l];
    private static long fibonachiTab(int n) {
        valuesTab[0] = 0;
        valuesTab[1] = 1;

        for (int i = 2; i < n; i++) {
            valuesTab[i] = valuesTab[i-1] + valuesTab[i-2];
        }
        return valuesTab[n-1];
    }



    private static long fibonachiTabOpt(int n) {
        long cache1 = 0;
        long cache2 = 1;
        long cache3 = 1;
        if(n == 1) return 0;
        if(n == 2) return 1;
        for (int i = 2; i < n; i++) {
            cache3 = cache1 + cache2;
            cache1 = cache2;
            cache2 = cache3;
        }
        return cache3;
    }

    static long[] values = new long[l];
    private static long fibonachiMemo(int n) {
        if (n == 1) return 0;
        if (n == 2) return 1;


        if(values[n] != 0) return values[n];
        long nextValue = fibonachiMemo(n-1) + fibonachiMemo(n-2);
        values[n] = nextValue;
        return nextValue;
    }

    private static long fibonachiRecusive(int n) {
        if (n == 1) return 0;
        if (n == 2) return 1;

        return fibonachiRecusive(n-1) + fibonachiRecusive(n-2);
    }

}
