package basicJava;

import java.util.Scanner;

public class HomeWork220928 {
    static int firstValue = 100500;
    static String dividerRepeat = "*";
    static Scanner scannerInClass = new Scanner(System.in);

    private static int getSum(int a, int b) {
        return a + b;
    }

    private static int getMin(int a, int b) {
        return a - b;
    }

    private static int getMult(int a, int b) {
        return a * b;
    }

    private static int getDiv(int a, int b) {
        return a / b;
    }

    private static int increaseValByOne(int a) {
        return a++;
    }

    private static int reduceValByOne(int a) {
        return a--;
    }

    private static double getSquareOfVal(double a) {
        return Math.pow(a, 2.0);
    }

    private static double getSquareRootOfValue(double a) {
        return Math.sqrt(a);
    }

    private static void increaseFirstValue(int a) {
        firstValue += a;
    }

    private static void getFirstValue() {
        System.out.println("Печать значения firstValue из метода: " + firstValue);
    }

    private static int changeSecondValue(int b) {
        b += 456;
        return b;
    }

    private static int getResidueOfDiv(int a, int b) {
        return a % b;
    }

    private static void printDivider() {
        System.out.println("-----------");
    }

    private static void getDivider(int a){
        dividerRepeat = dividerRepeat.repeat(a);
    }

    private static void changeDivider(String str, int b) {
        dividerRepeat = str.repeat(b);
    }

    private static void addAmountToFirstValue() {
        firstValue += 100;
        getFirstValue();
    }

    private static void addSomeAmountToFirstValue(int a) {
        firstValue += a;
        getFirstValue();
        printDivider();
    }

    private static void printName() {
        System.out.println("Введите имя: ");
        System.out.println("Вы ввели имя в методе printName: " + scannerInClass.next());
    }

    private static void collectOfSomeMethods() {
        System.out.println(dividerRepeat);
        addAmountToFirstValue();
        System.out.println("Введите целое значение: ");
        addSomeAmountToFirstValue(scannerInClass.nextInt());
        printName();
    }

    private static void changeDividerSecond() {
        System.out.println("Поменяем еще раз разделитель");
        System.out.println("Введите новый символ: ");
        System.out.println(scannerInClass.next().repeat(55));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите значение b (целое число): ");
        int b = scanner.nextInt();
        increaseFirstValue(b);
        System.out.println("Значение переменной firstValue: " + firstValue);
        getFirstValue();
        int secondValue = getSum(getMin(firstValue, b), 150);
        System.out.println("Вывод значения переменной secondValue: " + secondValue);
        System.out.println("Произведение firstValue и secondValue: " + getMult(firstValue, secondValue));
        secondValue = changeSecondValue(secondValue);
        System.out.println("Вывод значения secondValue: " + secondValue);
        System.out.println("firstValue разделить на secondValue: " + getDiv(firstValue, secondValue));
        System.out.println("Увеличиваем на 1 secondValue: " + increaseValByOne(secondValue));
        System.out.println("Уменьшаем на 1 firstValue: " + reduceValByOne(firstValue));
        printDivider();
        System.out.println("Квадрат 96: " + getSquareOfVal(96));
        System.out.println("Обратная операция: " + getSquareRootOfValue(getSquareOfVal(96)));
        printDivider();
        System.out.println("Укажите любое целое значение: ");
        System.out.println("Остаток от деления на 5: " + getResidueOfDiv(scanner.nextInt(), 5));
        System.out.println("Укажите сколько раз повторить разделитель: ");
        int repeatCount = scanner.nextInt();
        getDivider(repeatCount);
        System.out.println(dividerRepeat);
        System.out.println("Введите новый символ для разделителя: ");
        String newChar = scanner.next();
        changeDivider(newChar, repeatCount);
        collectOfSomeMethods();
        changeDividerSecond();

        //Вопросы для второй части задания:
        //1. Что токое метод main
        //2. Как считывать данные из консоли
        //3. Правила нэйминга для переменных, методов и классов
        //4. Когда используется void в объявлении метода?
    }
}
