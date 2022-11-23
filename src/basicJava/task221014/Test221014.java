package basicJava.task221014;

public class Test221014 {
    public static void main(String[] args) {
        int[] years = {42, 27, 35, 29, 51}; //массив возрастов

        testForeach(years);

        testFor(years);

        testWhile(years);

    }

    private static void testWhile(int[] years) {
        double sum = 0;
        int i = 0;
        while (i < years.length) {
            int year = years[i];
            sum += year;
            i++;
        }
        System.out.println("Среднее арифметическое через while" + sum / years.length);
    }

    private static void testFor(int[] years) {
        double sum = 0;
        for (int i = 0; i < years.length; i++) {
            int year = years[i];
            sum += year;
        }
        System.out.println("Среднее арифметическое через for" + sum / years.length);
    }


    private static void testForeach(int[] years) {
        double sum = 0; //суммарное количество лет в группе
        for (int year: years) {
            sum += year;
        }
        System.out.println("Среднее арифметическое через foreach" +sum / years.length);
    }
}
