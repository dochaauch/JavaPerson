public class HomeWork220926 {
    private static  void showResult(double first, double second, double third, double forth) {
        System.out.println(first * second + third / forth);
    }

    private static void showRemainderOfDivision(float first, float second) {
        System.out.println(first % second);
    }

    static double getDivision(float first, float second) {
        return first / second;
    }

    static float getIntegerDivision(int first, int second) {
        return first / second;
    }

    static int showSquaring(int base) {
        return base * base;
    }


    public static void main(String[] args) {
        showResult(2.4, 5.7, 3.8, 4);
        showRemainderOfDivision(19, 5);
        System.out.println(getDivision(getIntegerDivision(5, 2), 2.5f));
        System.out.println(getDivision(10, 3));
        System.out.println(getIntegerDivision(10, 3));
        System.out.println(showSquaring(5));
    }
}
