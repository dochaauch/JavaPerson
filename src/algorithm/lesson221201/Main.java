package algorithm.lesson221201;

public class Main {
    public static void main(String[] args) {
//        Main main = new Main();
//        main.printNumbers(5);
//        System.out.println();
//        main.printNumbers2(5);
        System.out.println(fibonacci(8));
    }

    //Recursion
    void printNumbers(int n) {
        if (n<0) return;

        System.out.print(n + " ");
        printNumbers(n-1);

    //printNumbers(5) => 5
        //printNumbers(4) => 4;
            //printNumbers(3) => 3;
                //printNumbers(2) => 2;
                    //printNumbers(1) => 1;
                        //printNumbers(0) => 0;
                            //n = -1 return
    }

    void printNumbersIterativ(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.println(n + " ");
        }
    }


    void printNumbers2(int n) {
        if (n < 0) return;
        printNumbers2(n - 1);
        System.out.print(n + " ");
    }

    private static int functionIteration(int n) {
        int res =0;
        for (int i = 0; i <= n; i++) {
            res = res + i;
        }
        return res;
    }


    //functionRecursion(5,0)
    static int functionRecursionTail(int n, int res) {
        if (n==0) {
            return res;
        }
        else {
            return functionRecursionTail(n-1, res +n);//tail recursion
        }
    }

    //тоже самое, без доп.переменной для суммы
    static int functionRecursionNonTail(int n) {
        if (n==0) {
            return n;
        }
        else {
            return n + functionRecursionNonTail(n-1); //non-tail recursion, последнее действие сложение
        }
    }


    //Direct non-direct

    //non-direct. лучше не использовать, слишком сложно
    void test1(int n){
        test2(n-2);
    }
    void test2(int n){
        if(n<=1) return;
       test1(n+1);
    }


    public static int countConsonantIteration(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if (isConsonant(letter)){
                count++;
            }
        }
        return count;
    }

    public int countConsonantRecursion(String s) {
        return countConsonantRecursiveCall(s, 0);
    }

    public static int countConsonantRecursiveCall(String s, int res){
        if (s.isBlank()) return 0;
        else {
            char letter = s.charAt(0);
            int count = isConsonant(letter) ? 1: 0;
            return countConsonantRecursiveCall(s.substring(1), res + count);
        }
    }

    private static boolean isConsonant(char ch) {
        char letter =  Character.toUpperCase(ch);
        return letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U';
    }


    public int countConsonantRecursionOther(String s) {
        return countConsonantOther(s, 0, 0);
    }

    private static int countConsonantOther(String str, int res, int n) {
        if (n==str.length()) return res;
        else{
            char letter = str.charAt(n);
            int count = isConsonant(letter) ?1:0;
            return countConsonantOther(str, res + count, n+1);
        }
    }
    // countConsonantOther("hello", res = 0 , n = 0)
    // letter = "h"; count = 0
    //      countConsonantOther("hello", res = 0, n = 1)
    //      letter = "e", count = 1
    //          countConsonantOther("hello", res = 1, n = 2)
    //          letter = "l", count = 0
    //              countConsonantOther("hello", res = 1, n = 3)
    //              letter = "l", count = 0
    //                  countConsonantOther("hello", res = 1, n = 4)
    //                  letter = "o", count = 1
    //                      countConsonantOther("hello", res = 2, n = 5)
    //                      n == "hello".length (5 =5)
    //                      return 2 (res)


    //Fibonacci numbers 0,1,1,2,5,8,13,21,34...
    //More than one recursive call
    //n - order of fibonacci sequence not counting first elements
    static long fibonacci(int n) {
        if (n == 0 || n==1) return 1;
        else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    //Exercise write down stack of calls

    //binary search
    //problem: find key in sorted array
    //returns index of key
    //arr[1,4,7,9,12,15], key = 9
    //take element from the middle 7
    //compare to key 7==9 false
    //compare tp key 7<9
    //if middle element less than key repeat procedure for right half of array
    //if middle element more than key repeat procedure for left half of array
    int binarySearch(int[] arr, int key){
        return -1;
    }


    //stack
    //operation O(1)
    //push - add element to stack
    //pop - removes an element from stack
    //isEmpty - check is stack empty
    //peek - retrieves an element from stack



    //n! = n*(n-1)*(n-2)... 1, 0! = 1, 1! = 1
    long factorial(int n) {
        if(n==1) return 1;
        return n * factorial(n-1);
    }
    //stack()
    //stack (5*factorial(4), 4*factorial(3), 3*factorial(2),2*factorial(1))
    //n==1
    //stack (5*factorial(4), 4*factorial(3), 3*factorial(2),2*1)
    //stack (5*factorial(4), 4*factorial(3), 3*2*1)
    //stack (5*factorial(4), 4*3*2*1)
    //stack (5*4*3*2*1)
    //return 120
    //stack ()

    //tail non-tail recusion
    //tail - last operation - recursive  call of function


    long factorialIteractive(int n) {
        long res = 1;
        for (int i = 2; i <=n ; i++) {
            res *=i;
        }
        return res;
    }





    class Stack{
        private Integer[] arr;
        //[null,null,null,null,null,null] if length = 6, java point of view
        //push(3) => [3,null,null,null,null,null], currIdx = 1
        //push(6) => [3,6,null,null,null,null], currIdx = 2
        //push(9) => [3,6,9,null,null,null], currIdx = 3
        //pop() => [3,6,null,null,null,null], currIdx = 2

        //if we start with currIdx = length -1, нам так не надо
        //push(7) => [null,null,null,null,null,7]
        //push(9) => [null,null,null,null,9,7]
        private int currIdx = 0; //[]

        public Stack(int length) {
            this.arr = new Integer[length];
        }

        public void push(int elem) {
            arr[currIdx] = elem;
            currIdx++;
        }

        public int pop(){
            currIdx--;

            int elem = arr[currIdx];
            arr[currIdx] = null;
            return elem;
        }
    }
}
