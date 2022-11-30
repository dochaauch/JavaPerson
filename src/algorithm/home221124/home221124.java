package algorithm.home221124;
/*






*/
public class home221124 {
    public static void main(String[] args) {
        home221124 home221124 = new home221124();
        int[] arr = {1,1,2,3,3,4,4};
        System.out.println(home221124.findElement(arr));
    }

    /*First level:  1) Вычислить сложность следующих алгоритмов*/
    //time complexity O(n^^)
    //space complexity O(1)
    void test1(int n)
    {
        if (n==1)
            return;
        for (int i=1; i<=n; i++) //O(n)
            for (int j=1; j<=n; j++){ //O(n)
                System.out.println("*");
                break;}
    }


    //time complexity O(n^2)
    //space complexity O(1)
    void test2(int n)
    {
        if (n==1)
            return;
        for (int i=1; i<=n; i++)//O(n)
            for (int j=1; j<=n; j++)//O(n)
                System.out.println("*");
    }


    //time complexity O(n)
    //space complexity O(1)
    void test3(int n)
    {
        int a = 0;
        for (int i = 0; i < n; i++) //O(n)
            for (int j = n; j > i; j--) //O(1)
                a = a + i + j;
    }

    //time complexity O(n log n)
    //space complexity O(1)
    void test4(int n)
    {
        int i, j, a = 0;
        for (i = n/2; i <=n; i++)
            for (j = 2; j <=n; j=j*2)
                a=a+n/2;
    }

    /*2) Find the element that appears once in a sorted array
    Given a sorted array in which all elements occur twice (one after the other)
    and one element appears only once.

    Простое решение состоит в обходе массива слева направо. Поскольку массив отсортирован,
    мы легко можем найти нужный элемент.*/


    //time complexity O(n)
    //space complexity O(1)
    int findElement(int[] arr) {
        int b = 1;
        for (int i = 0; i < arr.length; i+=2) {
            if(arr[i] != arr[b]){
                return arr[i];
            }
            b+=2;
        }
        return 0;
    }

    /*Задачки со звёздочкой - вычислить сложность в лучшем и худшем случае.*/
    //time complexity: best O(1), worse O(n)
    void test5(int n)
    {
        int a = 0, i = n;
        while (i > 0) {
            a += i;
            i /= 2;
        }
    }


    //time complexity: best O(min(a,b)), worse O(max(a,b))
    void method(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
    }

    //time complexity: best O(n), worse O(n^3)
    void method2(int n) {
        for (int i = 0; i < n / 2; i++) { //O(n)
            for (int j = 1; j + n / 2 <= n; j++) {
                for (int k = 1; k <= n; k = k * 2) {//O(n)
                    System.out.println("I am expert!");
                }
            }
        }
    }

    //time complexity: best O(n), worse O(n^2)
    void method3(int n) {
        for (int i = 1; i <= n; i++) {//O(n)
            for (int j = 1; j <= n; j = j + i) {
                System.out.println("I am expert!");
            }
        }
    }

}
