package algorithm.lesson221117;
//линейный поиск
public class IntroductionPractice {
    public static void main(String[] args) {
        /*
            1. Получить массив и число для поиска
            2. Начать с крайнего левого элемента (индекс 0)
            3. Перебираем элементы один за другим
            4. Сравниваем элемент с искомым
            5. Если наш элемент соответсвует искомому возвращаем индекс элемента
            6. Иначе возвращаем -1
            7. Выведи результат в консоль
         */
        int[] arr = {1, 23, 4, 5, 6, 7};
        int number = 5;
        
        int result = searchNumber(arr, number);

        printResult(result);
    }

    private static void printResult(int result) {
        if (result == -1) {
            System.out.println("Number not found");
        } else {
            System.out.println("Number of index = " + result);
        }
    }

    private static int searchNumber(int[] arr, int number) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }
}
