package homework221010;

import java.util.Scanner;

public class Loops {
    private static int firstValue;
    private static int secondValue;

    private static int getSum(int firstValue, int secondValue) {
        return Loops.firstValue + Loops.secondValue;
    }

    private static int getDiff(int firstValue, int secondValue){
        return firstValue - secondValue;
    }

    private static int getMult(int firstValue, int secondValue) {
        return firstValue * secondValue;
    }

    private static double getDiv(int firstValue, int secondValue) {
        return firstValue / secondValue;
    }

    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите первое целое число: ");
            firstValue = scanner.nextInt();
            System.out.println("Введите знак операции (+-*/): ");
            char operationSign = scanner.next().charAt(0);
            System.out.println("Введите второе целое число: ");
            secondValue = scanner.nextInt();
            String inputString = firstValue + " " + operationSign + " " + secondValue + " = ";
            if (operationSign == '+') {
                System.out.println(inputString + getSum(firstValue, secondValue));
            } else if (operationSign == '-') {
                System.out.println(inputString + getDiff(firstValue, secondValue));
            } else if (operationSign == '/') {
                System.out.println(inputString + getDiv(firstValue, secondValue));
            } else if (operationSign == '*') {
                System.out.println(inputString + getMult(firstValue, secondValue));
            }
            System.out.println("Закончить программу? Нажмиже 'y', если да, иначе любую другую букву");
            char checkPoint = scanner.next().charAt(0);
            if (checkPoint == 'y') {
                flag = false;
            }
        }
    }
}
