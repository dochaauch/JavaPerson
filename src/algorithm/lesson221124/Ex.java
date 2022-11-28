package algorithm.lesson221124;

public class Ex {
    public static void main(String[] args) {
        int[] arr = new int[]{1,4,6,7,8};

        // O(n) n - length of array
        //linearSearch(arr,7);

        // O(log n) n - length of array
        binarySearch(arr, 7);

        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        printStars7(arr1);


    }

    private static int binarySearch(int[] arr, int i) {
        return -1;
    }


    //time complexity
    //best case O(1)
    //worst case O(n)
    //average case O(n/2)
    private static int linearSearchExample(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                //best case == 0
                //average case i= n/2
                return i;
            }
        }
        return -1;
    }


    //time complexity O(1)
    //space complexity O(1)
    public static int sum(int one, int two) {
        return one + two;
    }

    //time complexity O(n)
    //space complexity O(1)
    public static void printStar(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
        }
    }

    //time complexity O(n)
    //space complexity O(n)
    public static void printStars1(int[] arr) {
        String stars[] = new String[arr.length/2];
        for (int i = 0; i < arr.length; i++) {
            stars[i/2] = "*" + 1;
        }
        for (int i = 0; i < stars.length; i++) {
            System.out.println(stars[i]);
        }
    }

    //time complexity O(10*n) ~O(n)
    //space complexity O(1)
    public static void printStars2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("*");
            }

        }
    }

    //time complexity O(n log n)
    //space complexity O(1)
    //2 ^ 3 = 8, log_2(8) = 3;
    //Math.log is natural logarithm, base is number 'e'
    public static void printStars3(int[] arr) {
        for (int i = arr.length; i >=0; i--) {
            for (int j = 0; j < Math.log(arr.length); j++) {
                System.out.println("*");
            }
        }
    }


    //time complexity O(n^3), где n - max(numbers.length, stars.length), слишком грубо!
    //time complexity O(m + n * m * n) ~ O(n^2 *m + m), где n-numbers.length, m-stars.length, вариант оптимальней
    //space complexity O(n)
    public static void printStars4(int[] numbers, String[] stars) {
        int m = stars.length;;
        int n = numbers.length;
        for (int i = 0; i < m; i++) { //O(m)
            System.out.println("*");
        }
        for (int i = 0; i < m* n; i++) { //O(m*n)
            for (int j = 0; j < n; j++) {  //O(n)  (вложенный цикл)
                System.out.println("-");
            }
        }
        //O(m) + O(m*n) *O(n) = O(m+m*n*n)
    }

    public static void printStars5(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("*");
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("+");
        }
        //numbers = [1,2,3,4,5,6,7,8,9]
        //*********
        //+++++++++
        //9 = length of array, 18 number operations
        //n = length of array, 2*n= n+n number of operation
    }

    public static void printStars6(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                System.out.println("*");
            }
        }

        //numbers = [1,2,3]
        //i = 0
        // i =0; j = 0 => *
        // i =0; j = 1 => *
        // i =0; j = 2 => *
        // i =0; j = 3 => 3 (j)<3 length of array false
        //i = 1
        // i =1; j = 0 => *
        // i =1; j = 1 => *
        // i =1; j = 2 => *
        // i =1; j = 3 => 3 (j)<3 length of array false
        //i = 2
        // i =2; j = 0 => *
        // i =2; j = 1 => *
        // i =2; j = 2 => *
        // i =2; j = 3 => 3 (j)<3 length of array false
        //9 = length of array, 18 number operations
        //n = length of arr

        //3 length of array, 9 = 3^2 operations
        //n length of array, n*n = n^^ operations

    }


    //time complexity O(n), n - min(a,b)
    //space complexity O(1)
    //Find the greater
    //Наибольший общий делитель
    // 48, 12
    // 3 common divisor, 48%3=0_ 12%3=0
    //12 - the greatest common divisor, 48%12=0, 12%12=0
    public static int getGCD(int a, int b) {
        int gcd = 1;
        for (int k = 0; k < Math.min(a,b); k++) {
            if(a%k == 0 && b%k == 0 ) {
                gcd = k;
            }
        }
        return gcd;
    }


    //assumes a > b
    //time complexity O?, but faster as O(n)
    //space complexity O(1)
    public static int getGCDEuklid(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;

        // a = 48; b = 9;
        //1st iteration
        //tmp = 3  =>48  % 9 = 3  (5*9=45, 48-45=3)
        //a = 9 (a=b)
        //b = 3 (b=tmp)

        //2nd iteration
        //a = 9; b=3 ; tmp =0 (9%3=0)
        //a = 3 (a=b)
        //b = 0 (b=tmp)

        //b!=0 false
        //return a 3
    }

    //time complexity O(n^2)
    //space complexity O(1)
    public static void printStars7(int arr[]) {
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
        //i=0, j=n-1 operation in internal cycle
        //i=1, j=n-2
        //i=2, j=n-3
        //...
        //i=n-2, j=n-2+1...n = n-1...n => 1 operation
        //i=n-1, j=0

        //Optional (math  magic)
        //estimate O ((n-1) +(n-2)+ (n-3)+...+1+0 ) ~ O(n^2-3n+2)/2 (arithmetic progression)

        // O(n^2-3n+2)/2 ~O(n^2)
    }

    //the greatest common divisor
    //input a,b - numbers
    //for each number from 1 to a or b whichever is less compute divisor of a or b
    //if both divisors equal to 0 then we have found common divisor

    //O(min(a,b))


    //time complexity best case = average case = worst case = 0(n^2)
    //space complexity O(1)
    public static void printStar8(int[] arr){
        int n = arr.length;
        while(n != 0){
            for (int i = 0; i < n - 1; i++) {
                System.out.print("*");
            }
            System.out.println();
            n--;
        }
    }

}
