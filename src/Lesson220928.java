import javax.swing.*;
import java.util.Scanner;

public class Lesson220928 {

    /**
     *  1]  int m1(f1)
     *  2]  void m2(f1, f2) sout
     *  3]  int m3(f1, f2, f3)
     *  4]  m4(f1, m) sout
     *  5]  int m5(m, m)
     *  6]  f1, f2 = init || scanner
     *  scanner.nextInt(); читаем Int с консоли
     * */

    //1. Объявить сканнер
    //2. Выбрать любые два пункта
    //3. Написать код

    static int get(int a) {
        return a/10;
    }

    void get(int a, int b) {
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(get(a));
        String str = scanner.next();

        System.out.println(str);
    }
}
