package algorithm.lesson230112;
/*2. На вершине лесенки, содержащей N ступенек, находится мячик, который начинает прыгать по ним вниз,
 к основанию.
Мячик может прыгнуть на следующую ступеньку, на ступеньку через одну или через 2.
(То есть, если мячик лежит на 8-ой ступеньке, то он может переместиться на 5-ую, 6-ую или 7-ую.)
Определить число всевозможных «маршрутов» мячика с вершины на землю.*/
public class Task2 {
    public static void main(String[] args) {
        System.out.println(findCountOfRouts(5));
    }

    private static int findCountOfRouts(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 4;
        return findCountOfRouts(n-1) + findCountOfRouts(n-2) + findCountOfRouts(n-3);
    }


}
