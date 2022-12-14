package algorithm.home221213;
/*Даны два целых числа x и n, напишите функцию для вычисления x^n
 решение 1 - рекурсивно O(n)
 решение 2 - улучшить решение 1 до O(lon n)
*/
public class Task01 {
    public static double pow(double x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * pow(x, n-1);
        }
    }
}
